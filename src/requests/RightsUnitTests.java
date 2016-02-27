package requests;

import java.sql.SQLException;

public class RightsUnitTests {
    public static void main(String[] args) {

        RequestsWithRoleCheck requestsWithRoleCheck;
        try {
            requestsWithRoleCheck = new RequestsWithRoleCheck("jdbc:mysql://localhost:3306/test?useSSL=false", "root", "", true);
        } catch (ClassNotFoundException | IllegalAccessException | SQLException | InstantiationException e) {
            e.printStackTrace();
            return;
        }

        try {
            requestsWithRoleCheck.getPatientInfosById("jmolina", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jmolina is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("jmolina", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jmolina", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jmolina", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("jmolina", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("jmolina", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("jmolina", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("jmolina", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("jmolina", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("jmolina", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("jmolina", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("jmolina", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("jmolina", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("jmolina", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("jmolina", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("jmolina", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("jmolina", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("jmolina", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("jmolina", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("jmolina", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("jmolina", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("jmolina", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("porcel", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("porcel", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("porcel", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("porcel", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("porcel", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("porcel", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("porcel", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("porcel", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("porcel", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("porcel", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("porcel", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("porcel", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("porcel", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user porcel is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("porcel", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("porcel", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("porcel", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("porcel", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("porcel", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("porcel", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("porcel", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("porcel", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("porcel", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("fsimon", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("fsimon", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("fsimon", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("fsimon", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("fsimon", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("fsimon", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("fsimon", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("fsimon", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user fsimon is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("fsimon", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("fsimon", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("fsimon", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("fsimon", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("fsimon", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("fsimon", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("fsimon", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("fsimon", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("fsimon", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("fsimon", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user fsimon is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("fsimon", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("fsimon", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("fsimon", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("fsimon", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("fdesgrandchamps", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("fdesgrandchamps", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("fdesgrandchamps", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("fdesgrandchamps", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("fdesgrandchamps", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("fdesgrandchamps", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("fdesgrandchamps", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("fdesgrandchamps", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("fdesgrandchamps", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("fdesgrandchamps", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("fdesgrandchamps", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("fdesgrandchamps", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("fdesgrandchamps", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("fdesgrandchamps", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("fdesgrandchamps", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user fdesgrandchamps is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("fdesgrandchamps", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("fdesgrandchamps", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("fdesgrandchamps", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("fdesgrandchamps", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("fdesgrandchamps", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("fdesgrandchamps", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("fdesgrandchamps", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("edekerviler", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("edekerviler", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("edekerviler", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("edekerviler", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("edekerviler", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("edekerviler", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("edekerviler", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("edekerviler", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("edekerviler", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("edekerviler", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user edekerviler is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("edekerviler", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("edekerviler", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("edekerviler", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("edekerviler", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("edekerviler", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("edekerviler", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("edekerviler", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("edekerviler", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("edekerviler", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("edekerviler", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user edekerviler is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("edekerviler", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("edekerviler", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("phenry", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("phenry", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("phenry", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("phenry", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("phenry", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("phenry", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("phenry", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("phenry", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("phenry", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("phenry", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("phenry", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("phenry", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("phenry", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("phenry", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user phenry is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("phenry", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("phenry", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("phenry", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("phenry", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("phenry", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("phenry", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("phenry", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("phenry", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("pherman", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("pherman", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("pherman", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("pherman", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("pherman", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("pherman", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("pherman", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("pherman", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("pherman", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user pherman is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("pherman", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("pherman", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("pherman", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("pherman", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("pherman", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("pherman", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("pherman", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("pherman", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("pherman", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("pherman", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user pherman is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("pherman", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("pherman", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("pherman", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("hchabriat", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("hchabriat", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("hchabriat", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("hchabriat", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("hchabriat", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("hchabriat", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("hchabriat", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("hchabriat", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("hchabriat", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("hchabriat", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("hchabriat", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("hchabriat", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("hchabriat", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("hchabriat", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("hchabriat", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("hchabriat", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hchabriat is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("hchabriat", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("hchabriat", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("hchabriat", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("hchabriat", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("hchabriat", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("hchabriat", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("rtadayoni", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("rtadayoni", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("rtadayoni", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("rtadayoni", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("rtadayoni", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("rtadayoni", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("rtadayoni", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("rtadayoni", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("rtadayoni", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("rtadayoni", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("rtadayoni", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user rtadayoni is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("rtadayoni", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("rtadayoni", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("rtadayoni", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("rtadayoni", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("rtadayoni", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("rtadayoni", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("rtadayoni", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("rtadayoni", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("rtadayoni", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("rtadayoni", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user rtadayoni is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("rtadayoni", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("acohensolal", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user acohensolal is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("acohensolal", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user acohensolal is supposed to be able to use getFullDMPByDMPId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("acohensolal", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user acohensolal is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("acohensolal", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user acohensolal is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("acohensolal", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user acohensolal is supposed to be able to use getFullDMPByLastName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("acohensolal", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user acohensolal is supposed to be able to use getFullDMPByPatientId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("acohensolal", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("acohensolal", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("acohensolal", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("acohensolal", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("acohensolal", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("acohensolal", 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("acohensolal", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user acohensolal is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("acohensolal", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user acohensolal is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("acohensolal", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user acohensolal is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("acohensolal", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user acohensolal is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("acohensolal", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user acohensolal is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("acohensolal", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("acohensolal", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("acohensolal", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("acohensolal", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("acohensolal", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("jbenifla", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("jbenifla", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jbenifla", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jbenifla", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("jbenifla", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("jbenifla", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("jbenifla", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("jbenifla", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("jbenifla", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("jbenifla", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("jbenifla", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("jbenifla", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("jbenifla", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("jbenifla", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("jbenifla", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("jbenifla", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("jbenifla", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("jbenifla", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("jbenifla", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("jbenifla", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("jbenifla", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("jbenifla", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbenifla is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("mallez", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("mallez", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user mallez is supposed to be able to use getFullDMPByDMPId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("mallez", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user mallez is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("mallez", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user mallez is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("mallez", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user mallez is supposed to be able to use getFullDMPByLastName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("mallez", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user mallez is supposed to be able to use getFullDMPByPatientId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("mallez", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("mallez", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("mallez", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("mallez", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("mallez", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("mallez", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("mallez", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("mallez", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("mallez", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("mallez", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("mallez", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("mallez", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("mallez", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("mallez", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("mallez", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("mallez", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user mallez is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("bmegarbane", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("bmegarbane", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("bmegarbane", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("bmegarbane", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("bmegarbane", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("bmegarbane", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("bmegarbane", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("bmegarbane", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("bmegarbane", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("bmegarbane", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("bmegarbane", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("bmegarbane", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("bmegarbane", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("bmegarbane", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("bmegarbane", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("bmegarbane", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("bmegarbane", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("bmegarbane", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("bmegarbane", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("bmegarbane", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("bmegarbane", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("bmegarbane", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user bmegarbane is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("dpayendelagaranderie", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("dpayendelagaranderie", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user dpayendelagaranderie is supposed to be able to use getFullDMPByDMPId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("dpayendelagaranderie", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user dpayendelagaranderie is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("dpayendelagaranderie", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user dpayendelagaranderie is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("dpayendelagaranderie", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user dpayendelagaranderie is supposed to be able to use getFullDMPByLastName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("dpayendelagaranderie", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user dpayendelagaranderie is supposed to be able to use getFullDMPByPatientId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("dpayendelagaranderie", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("dpayendelagaranderie", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("dpayendelagaranderie", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("dpayendelagaranderie", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("dpayendelagaranderie", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("dpayendelagaranderie", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("dpayendelagaranderie", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("dpayendelagaranderie", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("dpayendelagaranderie", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("dpayendelagaranderie", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("dpayendelagaranderie", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("dpayendelagaranderie", 0, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("dpayendelagaranderie", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("dpayendelagaranderie", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("dpayendelagaranderie", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("dpayendelagaranderie", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user dpayendelagaranderie is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("hbarreteau", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("hbarreteau", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("hbarreteau", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("hbarreteau", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("hbarreteau", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("hbarreteau", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("hbarreteau", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("hbarreteau", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("hbarreteau", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("hbarreteau", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("hbarreteau", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("hbarreteau", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("hbarreteau", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("hbarreteau", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("hbarreteau", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("hbarreteau", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("hbarreteau", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("hbarreteau", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("hbarreteau", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("hbarreteau", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("hbarreteau", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("hbarreteau", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user hbarreteau is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("jlaredo", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("jlaredo", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user jlaredo is supposed to be able to use getFullDMPByDMPId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jlaredo", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user jlaredo is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jlaredo", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user jlaredo is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("jlaredo", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user jlaredo is supposed to be able to use getFullDMPByLastName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("jlaredo", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user jlaredo is supposed to be able to use getFullDMPByPatientId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("jlaredo", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("jlaredo", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("jlaredo", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("jlaredo", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("jlaredo", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("jlaredo", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("jlaredo", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("jlaredo", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("jlaredo", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("jlaredo", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("jlaredo", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("jlaredo", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("jlaredo", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("jlaredo", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("jlaredo", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("jlaredo", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jlaredo is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("olaprevote", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("olaprevote", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("olaprevote", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("olaprevote", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("olaprevote", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("olaprevote", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("olaprevote", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("olaprevote", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("olaprevote", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("olaprevote", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("olaprevote", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("olaprevote", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("olaprevote", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("olaprevote", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("olaprevote", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("olaprevote", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("olaprevote", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("olaprevote", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("olaprevote", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("olaprevote", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("olaprevote", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("olaprevote", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user olaprevote is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("salifa", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("salifa", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user salifa is supposed to be able to use getFullDMPByDMPId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("salifa", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user salifa is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("salifa", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user salifa is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("salifa", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user salifa is supposed to be able to use getFullDMPByLastName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("salifa", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user salifa is supposed to be able to use getFullDMPByPatientId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("salifa", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("salifa", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("salifa", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("salifa", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("salifa", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("salifa", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("salifa", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("salifa", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("salifa", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("salifa", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("salifa", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("salifa", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("salifa", 0, "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("salifa", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("salifa", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("salifa", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user salifa is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("jbanas", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("jbanas", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jbanas", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("jbanas", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("jbanas", "");
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("jbanas", 0);
//        } catch (NoRightTo noRightTo) {
////Do nothing
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("jbanas", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("jbanas", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("jbanas", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("jbanas", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("jbanas", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addDMPElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("jbanas", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("jbanas", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("jbanas", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("jbanas", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("jbanas", 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("jbanas", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("jbanas", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("jbanas", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("jbanas", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("jbanas", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addElement.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("jbanas", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user jbanas is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }


        try {
            requestsWithRoleCheck.getPatientInfosById("abonet", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use getPatientInfosById.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

//        try {
//            requestsWithRoleCheck.getFullDMPByDMPId("abonet", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user abonet is supposed to be able to use getFullDMPByDMPId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("abonet", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user abonet is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByFirstName("abonet", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user abonet is supposed to be able to use getFullDMPByFirstName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByLastName("abonet", "");
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user abonet is supposed to be able to use getFullDMPByLastName.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }
//
//        try {
//            requestsWithRoleCheck.getFullDMPByPatientId("abonet", 0);
//        } catch (NoRightTo noRightTo) {
//            System.err.println("The user abonet is supposed to be able to use getFullDMPByPatientId.");
//        } catch (SQLException e) {
//            System.err.println("Failure with the database connection.");
//        }

        try {
            requestsWithRoleCheck.addDossier("abonet", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addDossier.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPPrescription("abonet", 0, 0, "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addDMPPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPEpisode("abonet", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addDMPEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPAntecedent("abonet", 0, 0, "", "", "", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addDMPAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPElements("abonet", 0, 0, 0);
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDMPDocument("abonet", 0, 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addDMPDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getPrescriptions("abonet", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use getPrescriptions.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getEpisode("abonet", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use getEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getAntecedent("abonet", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use getAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getElements("abonet", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use getElements.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.getDocument("abonet", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use getDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addPrescription("abonet", 0, "", "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addPrescription.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addEpisode("abonet", 0, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addEpisode.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addAntecedent("abonet", 0);
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addAntecedent.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addElement("abonet", 0, "", "", 0.0f, "", 0.0f, "", "");
        } catch (NoRightTo noRightTo) {
//Do nothing
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }

        try {
            requestsWithRoleCheck.addDocument("abonet", 0, null, 0.0f, "");
        } catch (NoRightTo noRightTo) {
            System.err.println("The user abonet is supposed to be able to use addDocument.");
        } catch (SQLException e) {
            System.err.println("Failure with the database connection.");
        }
    }
}