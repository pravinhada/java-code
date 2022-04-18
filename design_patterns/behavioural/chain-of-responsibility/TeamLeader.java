public class TeamLeader extends LeaveHandler {

    @Override
    public String applyLeave(Leave leave) {
        if (leave.getNumberOfDays() <= 7) {
            if (leave.getEmpTier() <= 4) {
                return "your leave days have been APPROVED by TeamLeader";
            } else {
                return "your employee tier is too low for the request " + leave.getNumberOfDays();
            }
        } else {
            return superVisor.applyLeave(leave);
        }
    }
}
