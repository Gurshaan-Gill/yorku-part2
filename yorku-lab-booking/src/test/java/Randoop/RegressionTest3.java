package Randoop;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    public void assertBooleanArrayEquals(boolean[] expectedArray, boolean[] actualArray) {
        if (expectedArray.length != actualArray.length) {
            throw new AssertionError("Array lengths differ: " + expectedArray.length + " != " + actualArray.length);
        }
        for (int i = 0; i < expectedArray.length; i++) {
            if (expectedArray[i] != actualArray[i]) {
                throw new AssertionError("Arrays differ at index " + i + ": " + expectedArray[i] + " != " + actualArray[i]);
            }
        }
    }

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        java.util.List<com.yorku.users.User> userList1 = headLabCoordinator0.getPendingApprovals();
        com.yorku.booking.BookingFacade bookingFacade2 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user3 = null;
        com.yorku.equipment.Equipment equipment7 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade2.cancelReservation(user3, equipment7);
        com.yorku.booking.BookingFacade bookingFacade9 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator10 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher14 = new com.yorku.users.Researcher("", "", "hi!");
        double double15 = researcher14.getHourlyRate();
        headLabCoordinator10.approveUser((com.yorku.users.User) researcher14);
        com.yorku.users.Researcher researcher20 = new com.yorku.users.Researcher("", "", "hi!");
        double double21 = researcher20.getHourlyRate();
        headLabCoordinator10.approveUser((com.yorku.users.User) researcher20);
        com.yorku.equipment.Equipment equipment26 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str27 = equipment26.getId();
        com.yorku.command.CancelCommand cancelCommand28 = new com.yorku.command.CancelCommand(bookingFacade9, (com.yorku.users.User) researcher20, equipment26);
        com.yorku.equipment.Equipment equipment32 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str33 = equipment32.getLocation();
        java.lang.String str34 = equipment32.getDescription();
        com.yorku.command.ExtendCommand extendCommand36 = new com.yorku.command.ExtendCommand(bookingFacade2, (com.yorku.users.User) researcher20, equipment32, (int) '#');
        com.yorku.booking.BookingFacade bookingFacade37 = null;
        com.yorku.users.Researcher researcher41 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status42 = null;
        researcher41.setStatus(status42);
        com.yorku.users.User.Status status44 = null;
        researcher41.setStatus(status44);
        com.yorku.equipment.Equipment equipment49 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment49.setDescription("");
        java.lang.String str52 = equipment49.getDescription();
        equipment49.setAvailable(false);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade37, (com.yorku.users.User) researcher41, equipment49, (int) (byte) 100);
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user58 = null;
        com.yorku.equipment.Equipment equipment62 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade57.cancelReservation(user58, equipment62);
        com.yorku.equipment.Equipment equipment64 = equipment62.clone();
        com.yorku.equipment.Equipment equipment65 = equipment64.clone();
        equipment65.setLocation("");
        bookingFacade2.extendReservation((com.yorku.users.User) researcher41, equipment65, (int) (short) 0);
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher41);
        com.yorku.coordinator.LabManager labManager75 = headLabCoordinator0.generateLabManager("", "hi!", "", "hi!");
        java.lang.String str76 = labManager75.getName();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(headLabCoordinator10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(equipment64);
        org.junit.Assert.assertNotNull(equipment65);
        org.junit.Assert.assertNotNull(labManager75);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.LabManager labManager22 = headLabCoordinator0.generateLabManager("", "hi!", "hi!", "hi!");
        com.yorku.booking.BookingFacade bookingFacade23 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator24 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher28 = new com.yorku.users.Researcher("", "", "hi!");
        double double29 = researcher28.getHourlyRate();
        headLabCoordinator24.approveUser((com.yorku.users.User) researcher28);
        com.yorku.users.Researcher researcher34 = new com.yorku.users.Researcher("", "", "hi!");
        double double35 = researcher34.getHourlyRate();
        headLabCoordinator24.approveUser((com.yorku.users.User) researcher34);
        com.yorku.equipment.Equipment equipment40 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str41 = equipment40.getId();
        com.yorku.command.CancelCommand cancelCommand42 = new com.yorku.command.CancelCommand(bookingFacade23, (com.yorku.users.User) researcher34, equipment40);
        com.yorku.users.Researcher researcher46 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status47 = null;
        researcher46.setStatus(status47);
        double double49 = researcher46.getHourlyRate();
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str54 = equipment53.getLocation();
        bookingFacade23.reserveEquipment((com.yorku.users.User) researcher46, equipment53, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator57 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher61 = new com.yorku.users.Researcher("", "", "hi!");
        double double62 = researcher61.getHourlyRate();
        headLabCoordinator57.approveUser((com.yorku.users.User) researcher61);
        java.lang.String str64 = researcher61.getPassword();
        com.yorku.booking.BookingFacade bookingFacade65 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest69 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment73 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str74 = equipment73.getLocation();
        java.lang.String str75 = equipment73.getDescription();
        java.lang.String str76 = equipment73.getDescription();
        bookingFacade65.cancelReservation((com.yorku.users.User) guest69, equipment73);
        com.yorku.command.ReserveCommand reserveCommand79 = new com.yorku.command.ReserveCommand(bookingFacade23, (com.yorku.users.User) researcher61, equipment73, (int) (byte) 1);
        com.yorku.users.Researcher researcher83 = new com.yorku.users.Researcher("", "", "hi!");
        double double84 = researcher83.getHourlyRate();
        com.yorku.equipment.Equipment equipment88 = new com.yorku.equipment.Equipment("", "", "");
        bookingFacade23.extendReservation((com.yorku.users.User) researcher83, equipment88, (int) (byte) -1);
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher83);
        com.yorku.coordinator.LabManager labManager96 = headLabCoordinator0.generateLabManager("", "hi!", "hi!", "");
        java.lang.String str97 = labManager96.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 20.0d + "'", double29 == 20.0d);
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 20.0d + "'", double35 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 20.0d + "'", double49 == 20.0d);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "hi!" + "'", str54, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator57);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 20.0d + "'", double62 == 20.0d);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 20.0d + "'", double84 == 20.0d);
        org.junit.Assert.assertNotNull(labManager96);
        org.junit.Assert.assertNull(str97);
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        com.yorku.users.Researcher researcher27 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status28 = null;
        researcher27.setStatus(status28);
        double double30 = researcher27.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade31 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user32 = null;
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade31.cancelReservation(user32, equipment36);
        java.lang.String str38 = equipment36.getLocation();
        boolean boolean39 = equipment36.isAvailable();
        com.yorku.command.ExtendCommand extendCommand41 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher27, equipment36, (int) (byte) 100);
        java.lang.String str42 = equipment36.getId();
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest7 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment11 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str12 = equipment11.getLocation();
        java.lang.String str13 = equipment11.getDescription();
        java.lang.String str14 = equipment11.getDescription();
        bookingFacade3.cancelReservation((com.yorku.users.User) guest7, equipment11);
        userRegistry0.registerUser((com.yorku.users.User) guest7);
        java.lang.String str17 = guest7.getIdNumber();
        java.lang.String str18 = guest7.getEmail();
        java.lang.String str19 = guest7.getPassword();
        org.junit.Assert.assertNotNull(userRegistry0);
// flaky "1) test1504(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.lang.String str11 = labManager1.getPassword();
        java.lang.String str12 = labManager1.getPassword();
        labManager1.markForMaintenance("");
        com.yorku.equipment.Equipment equipment16 = labManager1.getEquipment("");
        java.lang.String str17 = labManager1.getPassword();
        java.lang.String str18 = labManager1.getName();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(equipment16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        com.yorku.users.Student student3 = new com.yorku.users.Student("", "", "");
        java.lang.String str4 = student3.getIdNumber();
        double double5 = student3.getHourlyRate();
        java.lang.String str6 = student3.getEmail();
        double double7 = student3.getHourlyRate();
        double double8 = student3.getHourlyRate();
        boolean boolean9 = student3.isUniversityAffiliated();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 10.0d + "'", double7 == 10.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 10.0d + "'", double8 == 10.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.cancel();
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        com.yorku.equipment.Equipment equipment12 = labManager1.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("", "hi!", "hi!");
        labManager1.addEquipment(equipment16);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator19 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        double double24 = researcher23.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher23);
        com.yorku.users.Researcher researcher29 = new com.yorku.users.Researcher("", "", "hi!");
        double double30 = researcher29.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher29);
        com.yorku.equipment.Equipment equipment35 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str36 = equipment35.getId();
        com.yorku.command.CancelCommand cancelCommand37 = new com.yorku.command.CancelCommand(bookingFacade18, (com.yorku.users.User) researcher29, equipment35);
        com.yorku.users.Researcher researcher41 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status42 = null;
        researcher41.setStatus(status42);
        double double44 = researcher41.getHourlyRate();
        com.yorku.equipment.Equipment equipment48 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str49 = equipment48.getLocation();
        bookingFacade18.reserveEquipment((com.yorku.users.User) researcher41, equipment48, 0);
        labManager1.addEquipment(equipment48);
        java.lang.Class<?> wildcardClass53 = labManager1.getClass();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 20.0d + "'", double44 == 20.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass53);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor5 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor6 = new com.yorku.observer.EquipmentMonitor();
        sensor5.attach((com.yorku.observer.Observer) equipmentMonitor6);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor6);
        com.yorku.observer.Sensor sensor9 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor10 = new com.yorku.observer.EquipmentMonitor();
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor10);
        sensor9.detectUsage("hi!");
        com.yorku.observer.Sensor sensor14 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor15 = new com.yorku.observer.EquipmentMonitor();
        sensor14.attach((com.yorku.observer.Observer) equipmentMonitor15);
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor15);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor15);
        equipmentMonitor15.update("hi!");
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("");
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor17 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor18 = new com.yorku.observer.EquipmentMonitor();
        sensor17.attach((com.yorku.observer.Observer) equipmentMonitor18);
        equipmentMonitor18.update("hi!");
        equipmentMonitor18.update("");
        equipmentMonitor18.update("");
        equipmentMonitor18.update("");
        equipmentMonitor18.update("hi!");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor18);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.extend();
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.lang.String str11 = labManager1.getEmail();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection12 = labManager1.getAllEquipment();
        labManager1.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(equipmentCollection12);
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.UserRegistry userRegistry7 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status12 = null;
        researcher11.setStatus(status12);
        double double14 = researcher11.getHourlyRate();
        java.lang.String str15 = researcher11.getPassword();
        userRegistry7.registerUser((com.yorku.users.User) researcher11);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher11);
        com.yorku.coordinator.LabManager labManager22 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry7);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(labManager22);
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean24 = faculty23.isUniversityAffiliated();
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str29 = equipment28.getDescription();
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.command.ExtendCommand extendCommand32 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) faculty23, equipment28, (int) (byte) 100);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator33 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher37 = new com.yorku.users.Researcher("", "", "hi!");
        double double38 = researcher37.getHourlyRate();
        headLabCoordinator33.approveUser((com.yorku.users.User) researcher37);
        com.yorku.users.Researcher researcher43 = new com.yorku.users.Researcher("", "", "hi!");
        double double44 = researcher43.getHourlyRate();
        headLabCoordinator33.approveUser((com.yorku.users.User) researcher43);
        com.yorku.booking.BookingFacade bookingFacade46 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user47 = null;
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand53 = new com.yorku.command.ExtendCommand(bookingFacade46, user47, equipment51, 0);
        equipment51.setAvailable(true);
        java.lang.String str56 = equipment51.getLocation();
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher43, equipment51);
        com.yorku.users.Student student61 = new com.yorku.users.Student("", "", "hi!");
        com.yorku.coordinator.LabManager labManager63 = new com.yorku.coordinator.LabManager("");
        labManager63.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList66 = labManager63.getAllEquipmentIds();
        labManager63.enableEquipment("hi!");
        java.lang.String str69 = labManager63.getName();
        labManager63.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList72 = labManager63.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        labManager63.addEquipment(equipment76);
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection78 = labManager63.getAllEquipment();
        java.util.List<java.lang.String> strList79 = labManager63.getAllEquipmentIds();
        com.yorku.equipment.Equipment equipment83 = new com.yorku.equipment.Equipment("hi!", "hi!", "");
        labManager63.addEquipment(equipment83);
        com.yorku.command.CancelCommand cancelCommand85 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student61, equipment83);
        double double86 = student61.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 20.0d + "'", double38 == 20.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 20.0d + "'", double44 == 20.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(equipmentList72);
        org.junit.Assert.assertNotNull(equipmentCollection78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertTrue("'" + double86 + "' != '" + 10.0d + "'", double86 == 10.0d);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        com.yorku.observer.Sensor sensor9 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor10 = new com.yorku.observer.EquipmentMonitor();
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor10);
        equipmentMonitor10.update("hi!");
        equipmentMonitor10.update("");
        equipmentMonitor10.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor10);
        com.yorku.observer.EquipmentMonitor equipmentMonitor19 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor19.update("");
        equipmentMonitor19.update("");
        equipmentMonitor19.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor19);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        com.yorku.observer.Sensor sensor7 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor8 = new com.yorku.observer.EquipmentMonitor();
        sensor7.attach((com.yorku.observer.Observer) equipmentMonitor8);
        sensor7.detectUsage("hi!");
        sensor7.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor14 = new com.yorku.observer.EquipmentMonitor();
        sensor7.attach((com.yorku.observer.Observer) equipmentMonitor14);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor14);
        com.yorku.observer.Sensor sensor17 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor18 = new com.yorku.observer.EquipmentMonitor();
        sensor17.attach((com.yorku.observer.Observer) equipmentMonitor18);
        equipmentMonitor18.update("hi!");
        equipmentMonitor18.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor18);
        com.yorku.observer.Sensor sensor25 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor26 = new com.yorku.observer.EquipmentMonitor();
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor26);
        sensor25.detectUsage("hi!");
        sensor25.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor32 = new com.yorku.observer.EquipmentMonitor();
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor32);
        sensor25.notifyObservers("");
        sensor25.notifyObservers("hi!");
        sensor25.detectUsage("hi!");
        com.yorku.observer.Sensor sensor40 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor41 = new com.yorku.observer.EquipmentMonitor();
        sensor40.attach((com.yorku.observer.Observer) equipmentMonitor41);
        sensor40.detectUsage("hi!");
        sensor40.detectUsage("");
        com.yorku.observer.Sensor sensor47 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor48 = new com.yorku.observer.EquipmentMonitor();
        sensor47.attach((com.yorku.observer.Observer) equipmentMonitor48);
        sensor47.detectUsage("hi!");
        sensor47.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor54 = new com.yorku.observer.EquipmentMonitor();
        sensor47.attach((com.yorku.observer.Observer) equipmentMonitor54);
        sensor40.attach((com.yorku.observer.Observer) equipmentMonitor54);
        com.yorku.observer.Sensor sensor57 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor58 = new com.yorku.observer.EquipmentMonitor();
        sensor57.attach((com.yorku.observer.Observer) equipmentMonitor58);
        equipmentMonitor58.update("hi!");
        equipmentMonitor58.update("");
        sensor40.attach((com.yorku.observer.Observer) equipmentMonitor58);
        equipmentMonitor58.update("");
        equipmentMonitor58.update("");
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor58);
        sensor25.detectUsage("hi!");
        com.yorku.observer.Sensor sensor72 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor73 = new com.yorku.observer.EquipmentMonitor();
        sensor72.attach((com.yorku.observer.Observer) equipmentMonitor73);
        sensor72.detectUsage("");
        com.yorku.observer.Sensor sensor77 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor78 = new com.yorku.observer.EquipmentMonitor();
        sensor77.attach((com.yorku.observer.Observer) equipmentMonitor78);
        equipmentMonitor78.update("");
        equipmentMonitor78.update("");
        sensor72.attach((com.yorku.observer.Observer) equipmentMonitor78);
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor78);
        equipmentMonitor78.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor78);
        sensor0.detectUsage("");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getEmail();
        com.yorku.equipment.Equipment equipment11 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str12 = equipment11.getLocation();
        equipment11.setAvailable(true);
        labManager1.addEquipment(equipment11);
        java.lang.String str16 = equipment11.getDescription();
        equipment11.setDescription("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        java.lang.String str24 = equipment20.getDescription();
        equipment20.setAvailable(true);
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.extend();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.cancel();
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor5 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor6 = new com.yorku.observer.EquipmentMonitor();
        sensor5.attach((com.yorku.observer.Observer) equipmentMonitor6);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor6);
        com.yorku.observer.Sensor sensor9 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor10 = new com.yorku.observer.EquipmentMonitor();
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor10);
        com.yorku.observer.EquipmentMonitor equipmentMonitor12 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor12.update("");
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor12);
        com.yorku.observer.Sensor sensor16 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor17 = new com.yorku.observer.EquipmentMonitor();
        sensor16.attach((com.yorku.observer.Observer) equipmentMonitor17);
        equipmentMonitor17.update("");
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor17);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor17);
        sensor0.notifyObservers("hi!");
        sensor0.notifyObservers("");
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Guest guest10 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double11 = guest10.getHourlyRate();
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getId();
        com.yorku.command.ExtendCommand extendCommand18 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) guest10, equipment15, (int) (short) -1);
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status23 = null;
        researcher22.setStatus(status23);
        com.yorku.booking.BookingFacade bookingFacade25 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user26 = null;
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade25.cancelReservation(user26, equipment30);
        java.lang.String str32 = equipment30.getLocation();
        equipment30.setAvailable(false);
        com.yorku.command.CancelCommand cancelCommand35 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher22, equipment30);
        equipment30.setDescription("");
        equipment30.setLocation("hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest4 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getDescription();
        java.lang.String str11 = equipment8.getDescription();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest4, equipment8);
        com.yorku.users.Researcher researcher16 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status17 = null;
        researcher16.setStatus(status17);
        boolean boolean19 = researcher16.isUniversityAffiliated();
        java.lang.String str20 = researcher16.getIdNumber();
        com.yorku.coordinator.LabManager labManager22 = new com.yorku.coordinator.LabManager("");
        labManager22.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList25 = labManager22.getAllEquipmentIds();
        labManager22.enableEquipment("hi!");
        java.lang.String str28 = labManager22.getName();
        labManager22.markForMaintenance("");
        labManager22.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str37 = equipment36.getLocation();
        labManager22.addEquipment(equipment36);
        com.yorku.equipment.Equipment equipment40 = labManager22.getEquipment("hi!");
        boolean boolean41 = equipment40.isAvailable();
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher16, equipment40);
        com.yorku.users.Student student46 = new com.yorku.users.Student("hi!", "hi!", "hi!");
        double double47 = student46.getHourlyRate();
        com.yorku.coordinator.LabManager labManager49 = new com.yorku.coordinator.LabManager("");
        labManager49.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList52 = labManager49.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade53 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user54 = null;
        com.yorku.equipment.Equipment equipment58 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade53.cancelReservation(user54, equipment58);
        com.yorku.equipment.Equipment equipment60 = equipment58.clone();
        equipment60.setAvailable(true);
        labManager49.addEquipment(equipment60);
        java.util.List<com.yorku.equipment.Equipment> equipmentList64 = labManager49.getAvailableEquipment();
        labManager49.disableEquipment("hi!");
        com.yorku.equipment.Equipment equipment70 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str71 = equipment70.getLocation();
        labManager49.addEquipment(equipment70);
        com.yorku.command.CancelCommand cancelCommand73 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student46, equipment70);
        java.lang.String str74 = equipment70.getLocation();
        java.lang.String str75 = equipment70.getId();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(equipment40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 10.0d + "'", double47 == 10.0d);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(equipment60);
        org.junit.Assert.assertNotNull(equipmentList64);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection5 = labManager1.getAllEquipment();
        com.yorku.equipment.Equipment equipment7 = labManager1.getEquipmentById("");
        com.yorku.booking.BookingFacade bookingFacade8 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user9 = null;
        com.yorku.equipment.Equipment equipment13 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade8.cancelReservation(user9, equipment13);
        labManager1.addEquipment(equipment13);
        java.lang.String str16 = labManager1.getEmail();
        java.lang.String str17 = labManager1.getEmail();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection18 = labManager1.getAllEquipment();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipmentCollection5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(equipmentCollection18);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade5 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user6 = null;
        com.yorku.equipment.Equipment equipment10 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade5.cancelReservation(user6, equipment10);
        com.yorku.equipment.Equipment equipment12 = equipment10.clone();
        equipment12.setAvailable(true);
        labManager1.addEquipment(equipment12);
        labManager1.disableEquipment("hi!");
        com.yorku.equipment.Equipment equipment19 = labManager1.getEquipment("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNull(equipment19);
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.lang.String str11 = labManager1.getEmail();
        java.lang.String str12 = labManager1.getName();
        com.yorku.equipment.Equipment equipment14 = labManager1.getEquipmentById("hi!");
        java.util.List<java.lang.String> strList15 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Student student23 = new com.yorku.users.Student("", "hi!", "hi!");
        java.lang.String str24 = student23.getPassword();
        com.yorku.booking.BookingFacade bookingFacade25 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator26 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        double double31 = researcher30.getHourlyRate();
        headLabCoordinator26.approveUser((com.yorku.users.User) researcher30);
        com.yorku.users.Researcher researcher36 = new com.yorku.users.Researcher("", "", "hi!");
        double double37 = researcher36.getHourlyRate();
        headLabCoordinator26.approveUser((com.yorku.users.User) researcher36);
        com.yorku.equipment.Equipment equipment42 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str43 = equipment42.getId();
        com.yorku.command.CancelCommand cancelCommand44 = new com.yorku.command.CancelCommand(bookingFacade25, (com.yorku.users.User) researcher36, equipment42);
        com.yorku.users.Researcher researcher48 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status49 = null;
        researcher48.setStatus(status49);
        com.yorku.booking.BookingFacade bookingFacade51 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user52 = null;
        com.yorku.equipment.Equipment equipment56 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade51, user52, equipment56, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator59 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher63 = new com.yorku.users.Researcher("", "", "hi!");
        double double64 = researcher63.getHourlyRate();
        headLabCoordinator59.approveUser((com.yorku.users.User) researcher63);
        com.yorku.booking.BookingFacade bookingFacade66 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user67 = null;
        com.yorku.equipment.Equipment equipment71 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade66.cancelReservation(user67, equipment71);
        com.yorku.command.ReserveCommand reserveCommand74 = new com.yorku.command.ReserveCommand(bookingFacade51, (com.yorku.users.User) researcher63, equipment71, (int) (byte) 0);
        bookingFacade25.cancelReservation((com.yorku.users.User) researcher48, equipment71);
        com.yorku.command.CancelCommand cancelCommand76 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student23, equipment71);
        equipment71.setLocation("");
        equipment71.setLocation("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 20.0d + "'", double31 == 20.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 20.0d + "'", double37 == 20.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator59);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 20.0d + "'", double64 == 20.0d);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection12 = labManager1.getAllEquipment();
        labManager1.disableEquipment("");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(equipmentCollection12);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor7 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor7);
        sensor0.notifyObservers("");
        com.yorku.observer.EquipmentMonitor equipmentMonitor11 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor11);
        com.yorku.observer.EquipmentMonitor equipmentMonitor13 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor13.update("");
        equipmentMonitor13.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor13);
        sensor0.notifyObservers("hi!");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.UserRegistry userRegistry27 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean29 = userRegistry27.isEmailRegistered("");
        com.yorku.users.Researcher researcher33 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status34 = null;
        researcher33.setStatus(status34);
        double double36 = researcher33.getHourlyRate();
        java.lang.String str37 = researcher33.getPassword();
        userRegistry27.registerUser((com.yorku.users.User) researcher33);
        com.yorku.booking.BookingFacade bookingFacade39 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user40 = null;
        com.yorku.equipment.Equipment equipment44 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand46 = new com.yorku.command.ExtendCommand(bookingFacade39, user40, equipment44, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator47 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher51 = new com.yorku.users.Researcher("", "", "hi!");
        double double52 = researcher51.getHourlyRate();
        headLabCoordinator47.approveUser((com.yorku.users.User) researcher51);
        com.yorku.booking.BookingFacade bookingFacade54 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user55 = null;
        com.yorku.equipment.Equipment equipment59 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade54.cancelReservation(user55, equipment59);
        com.yorku.command.ReserveCommand reserveCommand62 = new com.yorku.command.ReserveCommand(bookingFacade39, (com.yorku.users.User) researcher51, equipment59, (int) (byte) 0);
        com.yorku.users.Researcher researcher66 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status67 = null;
        researcher66.setStatus(status67);
        double double69 = researcher66.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade70 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user71 = null;
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade70.cancelReservation(user71, equipment75);
        java.lang.String str77 = equipment75.getLocation();
        boolean boolean78 = equipment75.isAvailable();
        com.yorku.command.ExtendCommand extendCommand80 = new com.yorku.command.ExtendCommand(bookingFacade39, (com.yorku.users.User) researcher66, equipment75, (int) (byte) 100);
        com.yorku.command.ReserveCommand reserveCommand82 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher33, equipment75, (int) (byte) -1);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher33);
        java.util.List<com.yorku.users.User> userList84 = headLabCoordinator0.getPendingApprovals();
        com.yorku.coordinator.LabManager labManager89 = headLabCoordinator0.generateLabManager("", "hi!", "", "hi!");
        com.yorku.coordinator.LabManager labManager94 = headLabCoordinator0.generateLabManager("", "hi!", "hi!", "hi!");
        com.yorku.users.Researcher researcher98 = new com.yorku.users.Researcher("hi!", "", "");
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher98);
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headLabCoordinator47);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(labManager89);
        org.junit.Assert.assertNotNull(labManager94);
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor11 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor12 = new com.yorku.observer.EquipmentMonitor();
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor12);
        sensor11.detectUsage("hi!");
        sensor11.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor18 = new com.yorku.observer.EquipmentMonitor();
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor18);
        sensor11.notifyObservers("");
        sensor11.notifyObservers("hi!");
        sensor11.detectUsage("hi!");
        com.yorku.observer.Sensor sensor26 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor27 = new com.yorku.observer.EquipmentMonitor();
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor27);
        sensor26.detectUsage("hi!");
        sensor26.detectUsage("");
        com.yorku.observer.Sensor sensor33 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor34 = new com.yorku.observer.EquipmentMonitor();
        sensor33.attach((com.yorku.observer.Observer) equipmentMonitor34);
        sensor33.detectUsage("hi!");
        sensor33.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor40 = new com.yorku.observer.EquipmentMonitor();
        sensor33.attach((com.yorku.observer.Observer) equipmentMonitor40);
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor40);
        com.yorku.observer.Sensor sensor43 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor44 = new com.yorku.observer.EquipmentMonitor();
        sensor43.attach((com.yorku.observer.Observer) equipmentMonitor44);
        equipmentMonitor44.update("hi!");
        equipmentMonitor44.update("");
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor44);
        equipmentMonitor44.update("");
        equipmentMonitor44.update("");
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor44);
        sensor11.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor58 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor59 = new com.yorku.observer.EquipmentMonitor();
        sensor58.attach((com.yorku.observer.Observer) equipmentMonitor59);
        equipmentMonitor59.update("");
        equipmentMonitor59.update("");
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor59);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor59);
        sensor0.detectUsage("");
        sensor0.notifyObservers("hi!");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand33 = new com.yorku.command.ExtendCommand(bookingFacade26, user27, equipment31, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        com.yorku.booking.BookingFacade bookingFacade41 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user42 = null;
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade41.cancelReservation(user42, equipment46);
        com.yorku.command.ReserveCommand reserveCommand49 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher38, equipment46, (int) (byte) 0);
        com.yorku.users.Researcher researcher53 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status54 = null;
        researcher53.setStatus(status54);
        com.yorku.booking.BookingFacade bookingFacade56 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user57 = null;
        com.yorku.equipment.Equipment equipment61 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand63 = new com.yorku.command.ExtendCommand(bookingFacade56, user57, equipment61, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator64 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher68);
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.command.ReserveCommand reserveCommand79 = new com.yorku.command.ReserveCommand(bookingFacade56, (com.yorku.users.User) researcher68, equipment76, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand81 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) researcher53, equipment76, 0);
        com.yorku.users.User.Status status82 = researcher53.getStatus();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher53);
        java.util.List<com.yorku.users.User> userList84 = headLabCoordinator0.getPendingApprovals();
        com.yorku.coordinator.LabManager labManager89 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        com.yorku.coordinator.LabManager labManager94 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertNull(status82);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertNotNull(labManager89);
        org.junit.Assert.assertNotNull(labManager94);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        userRegistry0.registerUser((com.yorku.users.User) researcher30);
        com.yorku.users.Researcher researcher63 = new com.yorku.users.Researcher("", "", "");
        userRegistry0.registerUser((com.yorku.users.User) researcher63);
        com.yorku.users.User user66 = userRegistry0.getUserByEmail("");
        com.yorku.users.User.Status status67 = user66.getStatus();
        org.junit.Assert.assertNotNull(userRegistry0);
// flaky "2) test1532(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertTrue("'" + status67 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status67.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand33 = new com.yorku.command.ExtendCommand(bookingFacade26, user27, equipment31, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        com.yorku.booking.BookingFacade bookingFacade41 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user42 = null;
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade41.cancelReservation(user42, equipment46);
        com.yorku.command.ReserveCommand reserveCommand49 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher38, equipment46, (int) (byte) 0);
        com.yorku.users.Researcher researcher53 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status54 = null;
        researcher53.setStatus(status54);
        com.yorku.booking.BookingFacade bookingFacade56 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user57 = null;
        com.yorku.equipment.Equipment equipment61 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand63 = new com.yorku.command.ExtendCommand(bookingFacade56, user57, equipment61, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator64 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher68);
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.command.ReserveCommand reserveCommand79 = new com.yorku.command.ReserveCommand(bookingFacade56, (com.yorku.users.User) researcher68, equipment76, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand81 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) researcher53, equipment76, 0);
        com.yorku.users.User.Status status82 = researcher53.getStatus();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher53);
        java.util.List<com.yorku.users.User> userList84 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.Student student88 = new com.yorku.users.Student("", "", "");
        double double89 = student88.getHourlyRate();
        com.yorku.users.User.Status status90 = null;
        student88.setStatus(status90);
        java.lang.String str92 = student88.getIdNumber();
        double double93 = student88.getHourlyRate();
        headLabCoordinator0.rejectUser((com.yorku.users.User) student88);
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertNull(status82);
        org.junit.Assert.assertNotNull(userList84);
        org.junit.Assert.assertTrue("'" + double89 + "' != '" + 10.0d + "'", double89 == 10.0d);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        java.util.List<java.lang.String> strList10 = labManager1.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection11 = labManager1.getAllEquipment();
        java.util.List<java.lang.String> strList12 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(equipmentCollection11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
        com.yorku.users.Faculty faculty3 = new com.yorku.users.Faculty("hi!", "hi!", "");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getPassword();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        java.util.List<com.yorku.users.User> userList18 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.UserRegistry userRegistry19 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        java.lang.String str27 = researcher23.getPassword();
        userRegistry19.registerUser((com.yorku.users.User) researcher23);
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher23);
        com.yorku.coordinator.LabManager labManager34 = headLabCoordinator0.generateLabManager("", "hi!", "", "hi!");
        com.yorku.booking.BookingFacade bookingFacade35 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user36 = null;
        com.yorku.equipment.Equipment equipment40 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade35.cancelReservation(user36, equipment40);
        java.lang.String str42 = equipment40.getLocation();
        boolean boolean43 = equipment40.isAvailable();
        labManager34.addEquipment(equipment40);
        java.lang.String str45 = labManager34.getName();
        labManager34.disableEquipment("");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userRegistry19);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(labManager34);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        com.yorku.equipment.Equipment equipment8 = labManager1.getEquipmentById("");
        com.yorku.equipment.Equipment equipment10 = labManager1.getEquipmentById("");
        java.lang.String str11 = labManager1.getEmail();
        java.lang.String str12 = labManager1.getPassword();
        com.yorku.equipment.Equipment equipment14 = labManager1.getEquipment("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user6 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user8 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user10 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand18 = new com.yorku.command.ExtendCommand(bookingFacade11, user12, equipment16, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator19 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        double double24 = researcher23.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher23);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade26.cancelReservation(user27, equipment31);
        com.yorku.command.ReserveCommand reserveCommand34 = new com.yorku.command.ReserveCommand(bookingFacade11, (com.yorku.users.User) researcher23, equipment31, (int) (byte) 0);
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status39 = null;
        researcher38.setStatus(status39);
        double double41 = researcher38.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user43 = null;
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade42.cancelReservation(user43, equipment47);
        java.lang.String str49 = equipment47.getLocation();
        boolean boolean50 = equipment47.isAvailable();
        com.yorku.command.ExtendCommand extendCommand52 = new com.yorku.command.ExtendCommand(bookingFacade11, (com.yorku.users.User) researcher38, equipment47, (int) (byte) 100);
        java.lang.String str53 = researcher38.getIdNumber();
        userRegistry0.registerUser((com.yorku.users.User) researcher38);
        boolean boolean55 = researcher38.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "3) test1538(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user4);
// flaky "1) test1538(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user6);
// flaky "1) test1538(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user8);
// flaky "1) test1538(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 20.0d + "'", double41 == 20.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getEmail();
        labManager1.disableEquipment("hi!");
        labManager1.markForMaintenance("");
        java.lang.String str12 = labManager1.getName();
        java.lang.String str13 = labManager1.getName();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor11 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor12 = new com.yorku.observer.EquipmentMonitor();
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor12);
        sensor11.detectUsage("hi!");
        sensor11.detectUsage("");
        sensor11.notifyObservers("");
        com.yorku.observer.Sensor sensor20 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor21 = new com.yorku.observer.EquipmentMonitor();
        sensor20.attach((com.yorku.observer.Observer) equipmentMonitor21);
        equipmentMonitor21.update("hi!");
        equipmentMonitor21.update("");
        equipmentMonitor21.update("");
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor21);
        sensor11.detectUsage("hi!");
        com.yorku.observer.Sensor sensor32 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor33 = new com.yorku.observer.EquipmentMonitor();
        sensor32.attach((com.yorku.observer.Observer) equipmentMonitor33);
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor33);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor33);
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.equipment.Equipment equipment7 = equipment5.clone();
        equipment5.setLocation("");
        java.lang.String str10 = equipment5.getLocation();
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user6 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user8 = userRegistry0.getUserByEmail("hi!");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator9 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher13 = new com.yorku.users.Researcher("", "", "hi!");
        double double14 = researcher13.getHourlyRate();
        headLabCoordinator9.approveUser((com.yorku.users.User) researcher13);
        com.yorku.users.Researcher researcher19 = new com.yorku.users.Researcher("", "", "hi!");
        double double20 = researcher19.getHourlyRate();
        headLabCoordinator9.approveUser((com.yorku.users.User) researcher19);
        java.lang.String str22 = researcher19.getEmail();
        userRegistry0.registerUser((com.yorku.users.User) researcher19);
        java.lang.String str24 = researcher19.getEmail();
        java.lang.String str25 = researcher19.getPassword();
        double double26 = researcher19.getHourlyRate();
        com.yorku.users.User.Status status27 = researcher19.getStatus();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "4) test1542(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user4);
// flaky "2) test1542(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user6);
// flaky "2) test1542(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(headLabCoordinator9);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 20.0d + "'", double14 == 20.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertTrue("'" + status27 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status27.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor5 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor6 = new com.yorku.observer.EquipmentMonitor();
        sensor5.attach((com.yorku.observer.Observer) equipmentMonitor6);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor6);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        com.yorku.observer.Sensor sensor13 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor14 = new com.yorku.observer.EquipmentMonitor();
        sensor13.attach((com.yorku.observer.Observer) equipmentMonitor14);
        sensor13.detectUsage("hi!");
        sensor13.detectUsage("");
        com.yorku.observer.Sensor sensor20 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor21 = new com.yorku.observer.EquipmentMonitor();
        sensor20.attach((com.yorku.observer.Observer) equipmentMonitor21);
        sensor20.detectUsage("hi!");
        sensor20.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor27 = new com.yorku.observer.EquipmentMonitor();
        sensor20.attach((com.yorku.observer.Observer) equipmentMonitor27);
        sensor13.attach((com.yorku.observer.Observer) equipmentMonitor27);
        com.yorku.observer.Sensor sensor30 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor31 = new com.yorku.observer.EquipmentMonitor();
        sensor30.attach((com.yorku.observer.Observer) equipmentMonitor31);
        equipmentMonitor31.update("hi!");
        equipmentMonitor31.update("");
        sensor13.attach((com.yorku.observer.Observer) equipmentMonitor31);
        equipmentMonitor31.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor31);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor5 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor6 = new com.yorku.observer.EquipmentMonitor();
        sensor5.attach((com.yorku.observer.Observer) equipmentMonitor6);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor6);
        sensor0.notifyObservers("");
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status5 = null;
        researcher4.setStatus(status5);
        double double7 = researcher4.getHourlyRate();
        java.lang.String str8 = researcher4.getPassword();
        userRegistry0.registerUser((com.yorku.users.User) researcher4);
        com.yorku.users.User user11 = userRegistry0.getUserByEmail("");
        boolean boolean13 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean15 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            userRegistry0.registerUser(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.users.User.getEmail()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(user11);
// flaky "5) test1545(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.users.User user8 = null;
        com.yorku.booking.BookingFacade bookingFacade9 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user10 = null;
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade9.cancelReservation(user10, equipment14);
        com.yorku.users.Faculty faculty19 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade20 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user21 = null;
        com.yorku.equipment.Equipment equipment25 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade20.cancelReservation(user21, equipment25);
        com.yorku.equipment.Equipment equipment27 = equipment25.clone();
        com.yorku.equipment.Equipment equipment28 = equipment27.clone();
        equipment28.setLocation("");
        com.yorku.command.CancelCommand cancelCommand31 = new com.yorku.command.CancelCommand(bookingFacade9, (com.yorku.users.User) faculty19, equipment28);
        com.yorku.users.UserRegistry userRegistry32 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher36 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status37 = null;
        researcher36.setStatus(status37);
        double double39 = researcher36.getHourlyRate();
        java.lang.String str40 = researcher36.getPassword();
        userRegistry32.registerUser((com.yorku.users.User) researcher36);
        com.yorku.users.User user43 = userRegistry32.getUserByEmail("");
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str48 = equipment47.getLocation();
        equipment47.setAvailable(true);
        bookingFacade9.reserveEquipment(user43, equipment47, (int) ' ');
        equipment47.setDescription("hi!");
        bookingFacade0.reserveEquipment(user8, equipment47, (int) '4');
        equipment47.setDescription("hi!");
        equipment47.setAvailable(false);
        com.yorku.equipment.Equipment equipment61 = equipment47.clone();
        org.junit.Assert.assertNotNull(equipment27);
        org.junit.Assert.assertNotNull(equipment28);
        org.junit.Assert.assertNotNull(userRegistry32);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(equipment61);
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        java.lang.String str41 = researcher38.getPassword();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest46 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        java.lang.String str52 = equipment50.getDescription();
        java.lang.String str53 = equipment50.getDescription();
        bookingFacade42.cancelReservation((com.yorku.users.User) guest46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher38, equipment50, (int) (byte) 1);
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest61 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment65 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str66 = equipment65.getLocation();
        java.lang.String str67 = equipment65.getDescription();
        java.lang.String str68 = equipment65.getDescription();
        bookingFacade57.cancelReservation((com.yorku.users.User) guest61, equipment65);
        double double70 = guest61.getHourlyRate();
        java.lang.String str71 = guest61.getIdNumber();
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment75.setDescription("");
        com.yorku.command.CancelCommand cancelCommand78 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest61, equipment75);
        java.lang.String str79 = equipment75.getLocation();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 30.0d + "'", double70 == 30.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.coordinator.LabManager labManager11 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        java.util.List<com.yorku.users.User> userList12 = headLabCoordinator0.getPendingApprovals();
        com.yorku.booking.BookingFacade bookingFacade13 = null;
        com.yorku.users.Researcher researcher17 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status18 = null;
        researcher17.setStatus(status18);
        com.yorku.users.User.Status status20 = null;
        researcher17.setStatus(status20);
        com.yorku.equipment.Equipment equipment25 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment25.setDescription("");
        java.lang.String str28 = equipment25.getDescription();
        equipment25.setAvailable(false);
        com.yorku.command.ReserveCommand reserveCommand32 = new com.yorku.command.ReserveCommand(bookingFacade13, (com.yorku.users.User) researcher17, equipment25, (int) (byte) 100);
        double double33 = researcher17.getHourlyRate();
        double double34 = researcher17.getHourlyRate();
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher17);
        com.yorku.users.UserRegistry userRegistry36 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean38 = userRegistry36.isEmailRegistered("");
        com.yorku.users.Researcher researcher42 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status43 = null;
        researcher42.setStatus(status43);
        double double45 = researcher42.getHourlyRate();
        java.lang.String str46 = researcher42.getPassword();
        userRegistry36.registerUser((com.yorku.users.User) researcher42);
        boolean boolean49 = userRegistry36.isEmailRegistered("hi!");
        boolean boolean51 = userRegistry36.isEmailRegistered("hi!");
        com.yorku.users.User user53 = userRegistry36.getUserByEmail("hi!");
        java.lang.String str54 = null; // flaky "6) test1548(Randoop.RegressionTest3)": user53.getPassword();
        headLabCoordinator0.approveUser(user53);
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(userList12);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + double33 + "' != '" + 20.0d + "'", double33 == 20.0d);
        org.junit.Assert.assertTrue("'" + double34 + "' != '" + 20.0d + "'", double34 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 20.0d + "'", double45 == 20.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
// flaky "3) test1548(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
// flaky "3) test1548(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
// flaky "2) test1548(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user53);
// flaky "1) test1548(Randoop.RegressionTest3)":         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor7 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor7);
        sensor0.notifyObservers("");
        com.yorku.observer.EquipmentMonitor equipmentMonitor11 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor11);
        sensor0.detectUsage("");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        java.lang.String str7 = labManager1.getPassword();
        labManager1.enableEquipment("hi!");
        labManager1.disableEquipment("hi!");
        java.lang.String str12 = labManager1.getName();
        labManager1.enableEquipment("");
        com.yorku.equipment.Equipment equipment16 = labManager1.getEquipmentById("");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(equipment16);
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.reserve();
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        java.lang.String str7 = researcher4.getPassword();
        com.yorku.users.User.Status status8 = researcher4.getStatus();
        java.lang.String str9 = researcher4.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + status8 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status8.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        java.lang.String str41 = researcher38.getPassword();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest46 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        java.lang.String str52 = equipment50.getDescription();
        java.lang.String str53 = equipment50.getDescription();
        bookingFacade42.cancelReservation((com.yorku.users.User) guest46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher38, equipment50, (int) (byte) 1);
        com.yorku.users.Researcher researcher60 = new com.yorku.users.Researcher("", "", "hi!");
        double double61 = researcher60.getHourlyRate();
        com.yorku.equipment.Equipment equipment65 = new com.yorku.equipment.Equipment("", "", "");
        bookingFacade0.extendReservation((com.yorku.users.User) researcher60, equipment65, (int) (byte) -1);
        double double68 = researcher60.getHourlyRate();
        com.yorku.users.User.Status status69 = researcher60.getStatus();
        com.yorku.users.User.Status status70 = null;
        researcher60.setStatus(status70);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 20.0d + "'", double61 == 20.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 20.0d + "'", double68 == 20.0d);
        org.junit.Assert.assertTrue("'" + status69 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status69.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user14 = null;
        com.yorku.equipment.Equipment equipment18 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade13.cancelReservation(user14, equipment18);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade24 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user25 = null;
        com.yorku.equipment.Equipment equipment29 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade24.cancelReservation(user25, equipment29);
        com.yorku.equipment.Equipment equipment31 = equipment29.clone();
        com.yorku.equipment.Equipment equipment32 = equipment31.clone();
        equipment32.setLocation("");
        com.yorku.command.CancelCommand cancelCommand35 = new com.yorku.command.CancelCommand(bookingFacade13, (com.yorku.users.User) faculty23, equipment32);
        com.yorku.users.UserRegistry userRegistry36 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher40 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status41 = null;
        researcher40.setStatus(status41);
        double double43 = researcher40.getHourlyRate();
        java.lang.String str44 = researcher40.getPassword();
        userRegistry36.registerUser((com.yorku.users.User) researcher40);
        com.yorku.users.User user47 = userRegistry36.getUserByEmail("");
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str52 = equipment51.getLocation();
        equipment51.setAvailable(true);
        bookingFacade13.reserveEquipment(user47, equipment51, (int) ' ');
        com.yorku.command.CancelCommand cancelCommand57 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment51);
        com.yorku.users.User.Status status58 = null;
        researcher11.setStatus(status58);
        com.yorku.users.User.Status status60 = researcher11.getStatus();
        java.lang.Class<?> wildcardClass61 = researcher11.getClass();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertNotNull(equipment32);
        org.junit.Assert.assertNotNull(userRegistry36);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 20.0d + "'", double43 == 20.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNull(status60);
        org.junit.Assert.assertNotNull(wildcardClass61);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor7 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor7);
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        com.yorku.observer.Sensor sensor19 = new com.yorku.observer.Sensor();
        sensor19.notifyObservers("");
        sensor19.notifyObservers("");
        sensor19.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor26 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor27 = new com.yorku.observer.EquipmentMonitor();
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor27);
        sensor26.detectUsage("hi!");
        com.yorku.observer.Sensor sensor31 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor32 = new com.yorku.observer.EquipmentMonitor();
        sensor31.attach((com.yorku.observer.Observer) equipmentMonitor32);
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor32);
        com.yorku.observer.Sensor sensor35 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor36 = new com.yorku.observer.EquipmentMonitor();
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor36);
        com.yorku.observer.EquipmentMonitor equipmentMonitor38 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor38.update("");
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor38);
        com.yorku.observer.Sensor sensor42 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor43 = new com.yorku.observer.EquipmentMonitor();
        sensor42.attach((com.yorku.observer.Observer) equipmentMonitor43);
        equipmentMonitor43.update("");
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor43);
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor43);
        sensor26.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor51 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor52 = new com.yorku.observer.EquipmentMonitor();
        sensor51.attach((com.yorku.observer.Observer) equipmentMonitor52);
        sensor51.detectUsage("hi!");
        sensor51.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor58 = new com.yorku.observer.EquipmentMonitor();
        sensor51.attach((com.yorku.observer.Observer) equipmentMonitor58);
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor58);
        sensor19.attach((com.yorku.observer.Observer) equipmentMonitor58);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor58);
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        com.yorku.observer.EquipmentMonitor equipmentMonitor3 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor3.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor3);
        com.yorku.observer.Sensor sensor7 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor8 = new com.yorku.observer.EquipmentMonitor();
        sensor7.attach((com.yorku.observer.Observer) equipmentMonitor8);
        equipmentMonitor8.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor8);
        equipmentMonitor8.update("");
        equipmentMonitor8.update("");
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        com.yorku.equipment.Equipment equipment3 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getDescription();
        com.yorku.equipment.Equipment equipment6 = equipment3.clone();
        java.lang.String str7 = equipment3.getId();
        equipment3.setAvailable(false);
        boolean boolean10 = equipment3.isAvailable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(equipment6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand33 = new com.yorku.command.ExtendCommand(bookingFacade26, user27, equipment31, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        com.yorku.booking.BookingFacade bookingFacade41 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user42 = null;
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade41.cancelReservation(user42, equipment46);
        com.yorku.command.ReserveCommand reserveCommand49 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher38, equipment46, (int) (byte) 0);
        com.yorku.users.Researcher researcher53 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status54 = null;
        researcher53.setStatus(status54);
        com.yorku.booking.BookingFacade bookingFacade56 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user57 = null;
        com.yorku.equipment.Equipment equipment61 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand63 = new com.yorku.command.ExtendCommand(bookingFacade56, user57, equipment61, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator64 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher68);
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.command.ReserveCommand reserveCommand79 = new com.yorku.command.ReserveCommand(bookingFacade56, (com.yorku.users.User) researcher68, equipment76, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand81 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) researcher53, equipment76, 0);
        com.yorku.users.User.Status status82 = researcher53.getStatus();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher53);
        com.yorku.coordinator.LabManager labManager88 = headLabCoordinator0.generateLabManager("hi!", "hi!", "hi!", "hi!");
        com.yorku.users.Guest guest92 = new com.yorku.users.Guest("", "", "hi!");
        java.lang.String str93 = guest92.getEmail();
        headLabCoordinator0.approveUser((com.yorku.users.User) guest92);
        java.util.List<com.yorku.users.User> userList95 = headLabCoordinator0.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList96 = headLabCoordinator0.getPendingApprovals();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertNull(status82);
        org.junit.Assert.assertNotNull(labManager88);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "" + "'", str93, "");
        org.junit.Assert.assertNotNull(userList95);
        org.junit.Assert.assertNotNull(userList96);
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.reserve();
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Faculty faculty10 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade11.cancelReservation(user12, equipment16);
        com.yorku.equipment.Equipment equipment18 = equipment16.clone();
        com.yorku.equipment.Equipment equipment19 = equipment18.clone();
        equipment19.setLocation("");
        com.yorku.command.CancelCommand cancelCommand22 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty10, equipment19);
        com.yorku.users.UserRegistry userRegistry23 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher27 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status28 = null;
        researcher27.setStatus(status28);
        double double30 = researcher27.getHourlyRate();
        java.lang.String str31 = researcher27.getPassword();
        userRegistry23.registerUser((com.yorku.users.User) researcher27);
        com.yorku.users.User user34 = userRegistry23.getUserByEmail("");
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str39 = equipment38.getLocation();
        equipment38.setAvailable(true);
        bookingFacade0.reserveEquipment(user34, equipment38, (int) ' ');
        java.lang.String str44 = equipment38.getDescription();
        equipment38.setDescription("hi!");
        java.lang.String str47 = equipment38.getDescription();
        org.junit.Assert.assertNotNull(equipment18);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(userRegistry23);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.coordinator.LabManager labManager15 = new com.yorku.coordinator.LabManager("");
        labManager15.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList18 = labManager15.getAllEquipmentIds();
        labManager15.enableEquipment("hi!");
        java.lang.String str21 = labManager15.getName();
        labManager15.markForMaintenance("");
        labManager15.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment29 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str30 = equipment29.getLocation();
        labManager15.addEquipment(equipment29);
        java.lang.String str32 = equipment29.getLocation();
        com.yorku.equipment.Equipment equipment33 = equipment29.clone();
        bookingFacade0.extendReservation((com.yorku.users.User) researcher11, equipment33, (int) '#');
        com.yorku.users.Student student39 = new com.yorku.users.Student("hi!", "hi!", "hi!");
        java.lang.String str40 = student39.getPassword();
        double double41 = student39.getHourlyRate();
        double double42 = student39.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade43 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator44 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher48 = new com.yorku.users.Researcher("", "", "hi!");
        double double49 = researcher48.getHourlyRate();
        headLabCoordinator44.approveUser((com.yorku.users.User) researcher48);
        com.yorku.users.Researcher researcher54 = new com.yorku.users.Researcher("", "", "hi!");
        double double55 = researcher54.getHourlyRate();
        headLabCoordinator44.approveUser((com.yorku.users.User) researcher54);
        com.yorku.equipment.Equipment equipment60 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str61 = equipment60.getId();
        com.yorku.command.CancelCommand cancelCommand62 = new com.yorku.command.CancelCommand(bookingFacade43, (com.yorku.users.User) researcher54, equipment60);
        java.lang.String str63 = equipment60.getId();
        com.yorku.command.ReserveCommand reserveCommand65 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) student39, equipment60, (int) (short) 10);
        double double66 = student39.getHourlyRate();
        double double67 = student39.getHourlyRate();
        double double68 = student39.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(equipment33);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 10.0d + "'", double41 == 10.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 10.0d + "'", double42 == 10.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator44);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 20.0d + "'", double49 == 20.0d);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 20.0d + "'", double55 == 20.0d);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "hi!" + "'", str61, "hi!");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 10.0d + "'", double66 == 10.0d);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 10.0d + "'", double67 == 10.0d);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 10.0d + "'", double68 == 10.0d);
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.users.User user8 = null;
        com.yorku.booking.BookingFacade bookingFacade9 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user10 = null;
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade9.cancelReservation(user10, equipment14);
        java.lang.String str16 = equipment14.getLocation();
        boolean boolean17 = equipment14.isAvailable();
        java.lang.String str18 = equipment14.getDescription();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, user8, equipment14);
        cancelCommand19.execute();
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade5 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user6 = null;
        com.yorku.equipment.Equipment equipment10 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade5.cancelReservation(user6, equipment10);
        com.yorku.equipment.Equipment equipment12 = equipment10.clone();
        equipment12.setAvailable(true);
        labManager1.addEquipment(equipment12);
        java.util.List<com.yorku.equipment.Equipment> equipmentList16 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("hi!");
        labManager1.disableEquipment("");
        labManager1.disableEquipment("hi!");
        java.util.List<java.lang.String> strList23 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.Observer observer1 = null;
        sensor0.attach(observer1);
        // The following exception was thrown during execution in test generation
        try {
            sensor0.detectUsage("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.observer.Observer.update(String)\" because \"o\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        labManager1.enableEquipment("hi!");
        java.lang.String str14 = labManager1.getName();
        labManager1.disableEquipment("");
        com.yorku.equipment.Equipment equipment18 = labManager1.getEquipment("hi!");
        labManager1.markForMaintenance("");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipment18);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        boolean boolean4 = userRegistry0.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade5 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest9 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment13 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str14 = equipment13.getLocation();
        java.lang.String str15 = equipment13.getDescription();
        java.lang.String str16 = equipment13.getDescription();
        bookingFacade5.cancelReservation((com.yorku.users.User) guest9, equipment13);
        double double18 = guest9.getHourlyRate();
        java.lang.String str19 = guest9.getIdNumber();
        com.yorku.users.User.Status status20 = null;
        guest9.setStatus(status20);
        userRegistry0.registerUser((com.yorku.users.User) guest9);
        boolean boolean24 = userRegistry0.isEmailRegistered("hi!");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
// flaky "7) test1566(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        com.yorku.users.Student student27 = new com.yorku.users.Student("", "", "");
        double double28 = student27.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade29 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user30 = null;
        com.yorku.equipment.Equipment equipment34 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand36 = new com.yorku.command.ExtendCommand(bookingFacade29, user30, equipment34, 0);
        com.yorku.command.ExtendCommand extendCommand38 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) student27, equipment34, (int) 'a');
        com.yorku.users.Faculty faculty42 = new com.yorku.users.Faculty("hi!", "", "");
        com.yorku.coordinator.LabManager labManager44 = new com.yorku.coordinator.LabManager("");
        labManager44.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList47 = labManager44.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.equipment.Equipment equipment55 = equipment53.clone();
        equipment55.setAvailable(true);
        labManager44.addEquipment(equipment55);
        com.yorku.command.CancelCommand cancelCommand59 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty42, equipment55);
        cancelCommand59.execute();
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(equipment55);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest4 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getDescription();
        java.lang.String str11 = equipment8.getDescription();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest4, equipment8);
        com.yorku.users.Researcher researcher16 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status17 = null;
        researcher16.setStatus(status17);
        boolean boolean19 = researcher16.isUniversityAffiliated();
        java.lang.String str20 = researcher16.getIdNumber();
        com.yorku.coordinator.LabManager labManager22 = new com.yorku.coordinator.LabManager("");
        labManager22.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList25 = labManager22.getAllEquipmentIds();
        labManager22.enableEquipment("hi!");
        java.lang.String str28 = labManager22.getName();
        labManager22.markForMaintenance("");
        labManager22.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str37 = equipment36.getLocation();
        labManager22.addEquipment(equipment36);
        com.yorku.equipment.Equipment equipment40 = labManager22.getEquipment("hi!");
        boolean boolean41 = equipment40.isAvailable();
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher16, equipment40);
        com.yorku.users.Researcher researcher46 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status47 = null;
        researcher46.setStatus(status47);
        double double49 = researcher46.getHourlyRate();
        java.lang.String str50 = researcher46.getPassword();
        java.lang.String str51 = researcher46.getIdNumber();
        com.yorku.coordinator.LabManager labManager53 = new com.yorku.coordinator.LabManager("");
        labManager53.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList56 = labManager53.getAllEquipmentIds();
        labManager53.enableEquipment("hi!");
        java.lang.String str59 = labManager53.getName();
        labManager53.markForMaintenance("");
        labManager53.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment67 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str68 = equipment67.getLocation();
        labManager53.addEquipment(equipment67);
        java.lang.String str70 = equipment67.getLocation();
        equipment67.setAvailable(true);
        java.lang.String str73 = equipment67.getId();
        boolean boolean74 = equipment67.isAvailable();
        com.yorku.command.CancelCommand cancelCommand75 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher46, equipment67);
        boolean boolean76 = researcher46.isUniversityAffiliated();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(equipment40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 20.0d + "'", double49 == 20.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + true + "'", boolean74 == true);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        boolean boolean4 = userRegistry0.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade5 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest9 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment13 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str14 = equipment13.getLocation();
        java.lang.String str15 = equipment13.getDescription();
        java.lang.String str16 = equipment13.getDescription();
        bookingFacade5.cancelReservation((com.yorku.users.User) guest9, equipment13);
        double double18 = guest9.getHourlyRate();
        java.lang.String str19 = guest9.getIdNumber();
        com.yorku.users.User.Status status20 = null;
        guest9.setStatus(status20);
        userRegistry0.registerUser((com.yorku.users.User) guest9);
        com.yorku.users.UserRegistry userRegistry23 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean25 = userRegistry23.isEmailRegistered("");
        com.yorku.users.User user27 = userRegistry23.getUserByEmail("hi!");
        boolean boolean29 = userRegistry23.isEmailRegistered("");
        boolean boolean31 = userRegistry23.isEmailRegistered("");
        com.yorku.users.Researcher researcher35 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status36 = null;
        researcher35.setStatus(status36);
        com.yorku.users.User.Status status38 = null;
        researcher35.setStatus(status38);
        com.yorku.users.User.Status status40 = researcher35.getStatus();
        userRegistry23.registerUser((com.yorku.users.User) researcher35);
        com.yorku.users.User user43 = userRegistry23.getUserByEmail("");
        userRegistry0.registerUser(user43);
        com.yorku.users.User user46 = userRegistry0.getUserByEmail("hi!");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 30.0d + "'", double18 == 30.0d);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(userRegistry23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
// flaky "8) test1569(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNull(status40);
        org.junit.Assert.assertNotNull(user43);
// flaky "4) test1569(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user46);
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        com.yorku.users.Student student3 = new com.yorku.users.Student("", "", "");
        java.lang.String str4 = student3.getEmail();
        double double5 = student3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 10.0d + "'", double5 == 10.0d);
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        com.yorku.equipment.Equipment equipment3 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str4 = equipment3.getDescription();
        com.yorku.equipment.Equipment equipment5 = equipment3.clone();
        java.lang.String str6 = equipment3.getLocation();
        java.lang.String str7 = equipment3.getId();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(equipment5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        userRegistry0.registerUser((com.yorku.users.User) researcher30);
        com.yorku.users.User user61 = userRegistry0.getUserByEmail("");
        java.lang.String str62 = user61.getEmail();
        boolean boolean63 = user61.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(userRegistry0);
// flaky "9) test1572(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        labManager1.enableEquipment("hi!");
        java.lang.String str14 = labManager1.getName();
        labManager1.disableEquipment("");
        labManager1.disableEquipment("hi!");
        java.lang.String str19 = labManager1.getName();
        com.yorku.booking.BookingFacade bookingFacade20 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user21 = null;
        com.yorku.equipment.Equipment equipment25 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade20.cancelReservation(user21, equipment25);
        com.yorku.users.Guest guest30 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double31 = guest30.getHourlyRate();
        com.yorku.equipment.Equipment equipment35 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str36 = equipment35.getId();
        com.yorku.command.ExtendCommand extendCommand38 = new com.yorku.command.ExtendCommand(bookingFacade20, (com.yorku.users.User) guest30, equipment35, (int) (short) -1);
        com.yorku.equipment.Equipment equipment39 = equipment35.clone();
        labManager1.addEquipment(equipment35);
        com.yorku.equipment.Equipment equipment42 = labManager1.getEquipmentById("");
        com.yorku.booking.BookingFacade bookingFacade43 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user44 = null;
        com.yorku.equipment.Equipment equipment48 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand50 = new com.yorku.command.ExtendCommand(bookingFacade43, user44, equipment48, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator51 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher55 = new com.yorku.users.Researcher("", "", "hi!");
        double double56 = researcher55.getHourlyRate();
        headLabCoordinator51.approveUser((com.yorku.users.User) researcher55);
        com.yorku.booking.BookingFacade bookingFacade58 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user59 = null;
        com.yorku.equipment.Equipment equipment63 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade58.cancelReservation(user59, equipment63);
        com.yorku.command.ReserveCommand reserveCommand66 = new com.yorku.command.ReserveCommand(bookingFacade43, (com.yorku.users.User) researcher55, equipment63, (int) (byte) 0);
        java.lang.String str67 = equipment63.getDescription();
        com.yorku.equipment.Equipment equipment68 = equipment63.clone();
        equipment63.setDescription("");
        com.yorku.equipment.Equipment equipment71 = equipment63.clone();
        labManager1.addEquipment(equipment63);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 30.0d + "'", double31 == 30.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertNotNull(equipment39);
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertNotNull(headLabCoordinator51);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 20.0d + "'", double56 == 20.0d);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(equipment68);
        org.junit.Assert.assertNotNull(equipment71);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.reserve();
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        com.yorku.users.Student student27 = new com.yorku.users.Student("", "", "");
        double double28 = student27.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade29 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user30 = null;
        com.yorku.equipment.Equipment equipment34 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand36 = new com.yorku.command.ExtendCommand(bookingFacade29, user30, equipment34, 0);
        com.yorku.command.ExtendCommand extendCommand38 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) student27, equipment34, (int) 'a');
        com.yorku.users.Faculty faculty42 = new com.yorku.users.Faculty("hi!", "", "");
        com.yorku.coordinator.LabManager labManager44 = new com.yorku.coordinator.LabManager("");
        labManager44.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList47 = labManager44.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.equipment.Equipment equipment55 = equipment53.clone();
        equipment55.setAvailable(true);
        labManager44.addEquipment(equipment55);
        com.yorku.command.CancelCommand cancelCommand59 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty42, equipment55);
        double double60 = faculty42.getHourlyRate();
        double double61 = faculty42.getHourlyRate();
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 10.0d + "'", double28 == 10.0d);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(equipment55);
        org.junit.Assert.assertTrue("'" + double60 + "' != '" + 15.0d + "'", double60 == 15.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 15.0d + "'", double61 == 15.0d);
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher6 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status7 = null;
        researcher6.setStatus(status7);
        double double9 = researcher6.getHourlyRate();
        java.lang.String str10 = researcher6.getPassword();
        userRegistry0.registerUser((com.yorku.users.User) researcher6);
        boolean boolean13 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user15 = userRegistry0.getUserByEmail("");
        com.yorku.booking.BookingFacade bookingFacade16 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user17 = null;
        com.yorku.equipment.Equipment equipment21 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand23 = new com.yorku.command.ExtendCommand(bookingFacade16, user17, equipment21, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator24 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher28 = new com.yorku.users.Researcher("", "", "hi!");
        double double29 = researcher28.getHourlyRate();
        headLabCoordinator24.approveUser((com.yorku.users.User) researcher28);
        com.yorku.booking.BookingFacade bookingFacade31 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user32 = null;
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade31.cancelReservation(user32, equipment36);
        com.yorku.command.ReserveCommand reserveCommand39 = new com.yorku.command.ReserveCommand(bookingFacade16, (com.yorku.users.User) researcher28, equipment36, (int) (byte) 0);
        java.lang.String str40 = researcher28.getEmail();
        double double41 = researcher28.getHourlyRate();
        com.yorku.users.User.Status status42 = researcher28.getStatus();
        user15.setStatus(status42);
        java.lang.Class<?> wildcardClass44 = status42.getClass();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(headLabCoordinator24);
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 20.0d + "'", double29 == 20.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 20.0d + "'", double41 == 20.0d);
        org.junit.Assert.assertTrue("'" + status42 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status42.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertNotNull(wildcardClass44);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.extend();
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.coordinator.LabManager labManager11 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator12 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher16 = new com.yorku.users.Researcher("", "", "hi!");
        double double17 = researcher16.getHourlyRate();
        headLabCoordinator12.approveUser((com.yorku.users.User) researcher16);
        com.yorku.coordinator.LabManager labManager23 = headLabCoordinator12.generateLabManager("hi!", "", "hi!", "");
        com.yorku.coordinator.LabManager labManager28 = headLabCoordinator12.generateLabManager("", "", "hi!", "");
        com.yorku.users.Researcher researcher32 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status33 = null;
        researcher32.setStatus(status33);
        boolean boolean35 = researcher32.isUniversityAffiliated();
        headLabCoordinator12.approveUser((com.yorku.users.User) researcher32);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher32);
        com.yorku.coordinator.LabManager labManager42 = headLabCoordinator0.generateLabManager("", "", "hi!", "");
        com.yorku.booking.BookingFacade bookingFacade43 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user44 = null;
        com.yorku.equipment.Equipment equipment48 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand50 = new com.yorku.command.ExtendCommand(bookingFacade43, user44, equipment48, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator51 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher55 = new com.yorku.users.Researcher("", "", "hi!");
        double double56 = researcher55.getHourlyRate();
        headLabCoordinator51.approveUser((com.yorku.users.User) researcher55);
        com.yorku.booking.BookingFacade bookingFacade58 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user59 = null;
        com.yorku.equipment.Equipment equipment63 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade58.cancelReservation(user59, equipment63);
        com.yorku.command.ReserveCommand reserveCommand66 = new com.yorku.command.ReserveCommand(bookingFacade43, (com.yorku.users.User) researcher55, equipment63, (int) (byte) 0);
        com.yorku.users.Researcher researcher70 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status71 = null;
        researcher70.setStatus(status71);
        double double73 = researcher70.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade74 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user75 = null;
        com.yorku.equipment.Equipment equipment79 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade74.cancelReservation(user75, equipment79);
        java.lang.String str81 = equipment79.getLocation();
        boolean boolean82 = equipment79.isAvailable();
        com.yorku.command.ExtendCommand extendCommand84 = new com.yorku.command.ExtendCommand(bookingFacade43, (com.yorku.users.User) researcher70, equipment79, (int) (byte) 100);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher70);
        java.util.List<com.yorku.users.User> userList86 = headLabCoordinator0.getPendingApprovals();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(headLabCoordinator12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertNotNull(headLabCoordinator51);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 20.0d + "'", double56 == 20.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 20.0d + "'", double73 == 20.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(userList86);
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment13 = labManager1.getEquipment("hi!");
        java.lang.String str14 = labManager1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipment13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest4 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getDescription();
        java.lang.String str11 = equipment8.getDescription();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest4, equipment8);
        java.lang.String str13 = equipment8.getLocation();
        com.yorku.equipment.Equipment equipment14 = equipment8.clone();
        equipment8.setAvailable(false);
        java.lang.String str17 = equipment8.getLocation();
        java.lang.String str18 = equipment8.getLocation();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(equipment14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        boolean boolean8 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status13 = null;
        researcher12.setStatus(status13);
        com.yorku.users.User.Status status15 = null;
        researcher12.setStatus(status15);
        com.yorku.users.User.Status status17 = researcher12.getStatus();
        userRegistry0.registerUser((com.yorku.users.User) researcher12);
        boolean boolean20 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user22 = userRegistry0.getUserByEmail("");
        com.yorku.users.User user24 = userRegistry0.getUserByEmail("");
        boolean boolean26 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.booking.BookingFacade bookingFacade27 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user28 = null;
        com.yorku.equipment.Equipment equipment32 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand34 = new com.yorku.command.ExtendCommand(bookingFacade27, user28, equipment32, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator35 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher39 = new com.yorku.users.Researcher("", "", "hi!");
        double double40 = researcher39.getHourlyRate();
        headLabCoordinator35.approveUser((com.yorku.users.User) researcher39);
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user43 = null;
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade42.cancelReservation(user43, equipment47);
        com.yorku.command.ReserveCommand reserveCommand50 = new com.yorku.command.ReserveCommand(bookingFacade27, (com.yorku.users.User) researcher39, equipment47, (int) (byte) 0);
        java.lang.String str51 = researcher39.getEmail();
        userRegistry0.registerUser((com.yorku.users.User) researcher39);
        boolean boolean54 = userRegistry0.isEmailRegistered("");
        boolean boolean56 = userRegistry0.isEmailRegistered("hi!");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "10) test1581(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(status17);
// flaky "5) test1581(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user24);
// flaky "4) test1581(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator35);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 20.0d + "'", double40 == 20.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
// flaky "3) test1581(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.Researcher researcher6 = new com.yorku.users.Researcher("", "", "");
        userRegistry0.registerUser((com.yorku.users.User) researcher6);
        boolean boolean9 = userRegistry0.isEmailRegistered("hi!");
        org.junit.Assert.assertNotNull(userRegistry0);
// flaky "11) test1582(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "6) test1582(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        com.yorku.users.Faculty faculty3 = new com.yorku.users.Faculty("hi!", "", "hi!");
        boolean boolean4 = faculty3.isUniversityAffiliated();
        com.yorku.users.User.Status status5 = faculty3.getStatus();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + status5 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status5.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.lang.String str11 = labManager1.getEmail();
        java.lang.String str12 = labManager1.getName();
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user14 = null;
        com.yorku.equipment.Equipment equipment18 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade13.cancelReservation(user14, equipment18);
        com.yorku.users.Guest guest23 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double24 = guest23.getHourlyRate();
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str29 = equipment28.getId();
        com.yorku.command.ExtendCommand extendCommand31 = new com.yorku.command.ExtendCommand(bookingFacade13, (com.yorku.users.User) guest23, equipment28, (int) (short) -1);
        labManager1.addEquipment(equipment28);
        java.lang.String str33 = labManager1.getEmail();
        com.yorku.booking.BookingFacade bookingFacade34 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user35 = null;
        com.yorku.equipment.Equipment equipment39 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade34.cancelReservation(user35, equipment39);
        java.lang.String str41 = equipment39.getLocation();
        equipment39.setAvailable(false);
        labManager1.addEquipment(equipment39);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.equipment.Equipment equipment7 = equipment5.clone();
        com.yorku.equipment.Equipment equipment8 = equipment7.clone();
        equipment8.setLocation("");
        com.yorku.equipment.Equipment equipment11 = equipment8.clone();
        equipment11.setAvailable(true);
        equipment11.setDescription("hi!");
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertNotNull(equipment8);
        org.junit.Assert.assertNotNull(equipment11);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        extendCommand7.execute();
        extendCommand7.execute();
        extendCommand7.execute();
        extendCommand7.execute();
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor7 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor7);
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor15 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor16 = new com.yorku.observer.EquipmentMonitor();
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor16);
        sensor15.detectUsage("hi!");
        sensor15.detectUsage("");
        com.yorku.observer.Sensor sensor22 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor23 = new com.yorku.observer.EquipmentMonitor();
        sensor22.attach((com.yorku.observer.Observer) equipmentMonitor23);
        sensor22.detectUsage("hi!");
        sensor22.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor29 = new com.yorku.observer.EquipmentMonitor();
        sensor22.attach((com.yorku.observer.Observer) equipmentMonitor29);
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor29);
        com.yorku.observer.Sensor sensor32 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor33 = new com.yorku.observer.EquipmentMonitor();
        sensor32.attach((com.yorku.observer.Observer) equipmentMonitor33);
        equipmentMonitor33.update("hi!");
        equipmentMonitor33.update("");
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor33);
        equipmentMonitor33.update("");
        equipmentMonitor33.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor33);
        sensor0.detectUsage("");
        sensor0.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor49 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor50 = new com.yorku.observer.EquipmentMonitor();
        sensor49.attach((com.yorku.observer.Observer) equipmentMonitor50);
        sensor49.detectUsage("hi!");
        com.yorku.observer.Sensor sensor54 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor55 = new com.yorku.observer.EquipmentMonitor();
        sensor54.attach((com.yorku.observer.Observer) equipmentMonitor55);
        sensor49.attach((com.yorku.observer.Observer) equipmentMonitor55);
        equipmentMonitor55.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor55);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.UserRegistry userRegistry27 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean29 = userRegistry27.isEmailRegistered("");
        com.yorku.users.Researcher researcher33 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status34 = null;
        researcher33.setStatus(status34);
        double double36 = researcher33.getHourlyRate();
        java.lang.String str37 = researcher33.getPassword();
        userRegistry27.registerUser((com.yorku.users.User) researcher33);
        com.yorku.booking.BookingFacade bookingFacade39 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user40 = null;
        com.yorku.equipment.Equipment equipment44 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand46 = new com.yorku.command.ExtendCommand(bookingFacade39, user40, equipment44, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator47 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher51 = new com.yorku.users.Researcher("", "", "hi!");
        double double52 = researcher51.getHourlyRate();
        headLabCoordinator47.approveUser((com.yorku.users.User) researcher51);
        com.yorku.booking.BookingFacade bookingFacade54 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user55 = null;
        com.yorku.equipment.Equipment equipment59 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade54.cancelReservation(user55, equipment59);
        com.yorku.command.ReserveCommand reserveCommand62 = new com.yorku.command.ReserveCommand(bookingFacade39, (com.yorku.users.User) researcher51, equipment59, (int) (byte) 0);
        com.yorku.users.Researcher researcher66 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status67 = null;
        researcher66.setStatus(status67);
        double double69 = researcher66.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade70 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user71 = null;
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade70.cancelReservation(user71, equipment75);
        java.lang.String str77 = equipment75.getLocation();
        boolean boolean78 = equipment75.isAvailable();
        com.yorku.command.ExtendCommand extendCommand80 = new com.yorku.command.ExtendCommand(bookingFacade39, (com.yorku.users.User) researcher66, equipment75, (int) (byte) 100);
        com.yorku.command.ReserveCommand reserveCommand82 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher33, equipment75, (int) (byte) -1);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher33);
        com.yorku.coordinator.LabManager labManager88 = headLabCoordinator0.generateLabManager("hi!", "", "", "");
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection89 = labManager88.getAllEquipment();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection90 = labManager88.getAllEquipment();
        java.lang.Class<?> wildcardClass91 = labManager88.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headLabCoordinator47);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(labManager88);
        org.junit.Assert.assertNotNull(equipmentCollection89);
        org.junit.Assert.assertNotNull(equipmentCollection90);
        org.junit.Assert.assertNotNull(wildcardClass91);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("");
        java.lang.Class<?> wildcardClass17 = sensor0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest7 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment11 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str12 = equipment11.getLocation();
        java.lang.String str13 = equipment11.getDescription();
        java.lang.String str14 = equipment11.getDescription();
        bookingFacade3.cancelReservation((com.yorku.users.User) guest7, equipment11);
        userRegistry0.registerUser((com.yorku.users.User) guest7);
        java.lang.String str17 = guest7.getIdNumber();
        boolean boolean18 = guest7.isUniversityAffiliated();
        double double19 = guest7.getHourlyRate();
        java.lang.String str20 = guest7.getIdNumber();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest7 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment11 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str12 = equipment11.getLocation();
        java.lang.String str13 = equipment11.getDescription();
        java.lang.String str14 = equipment11.getDescription();
        bookingFacade3.cancelReservation((com.yorku.users.User) guest7, equipment11);
        userRegistry0.registerUser((com.yorku.users.User) guest7);
        java.lang.String str17 = guest7.getIdNumber();
        java.lang.String str18 = guest7.getEmail();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator19 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        double double24 = researcher23.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher23);
        com.yorku.users.Researcher researcher29 = new com.yorku.users.Researcher("", "", "hi!");
        double double30 = researcher29.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher29);
        com.yorku.users.Faculty faculty35 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator19.rejectUser((com.yorku.users.User) faculty35);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator37 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher41 = new com.yorku.users.Researcher("", "", "hi!");
        double double42 = researcher41.getHourlyRate();
        headLabCoordinator37.approveUser((com.yorku.users.User) researcher41);
        headLabCoordinator19.rejectUser((com.yorku.users.User) researcher41);
        com.yorku.users.Researcher researcher48 = new com.yorku.users.Researcher("hi!", "hi!", "hi!");
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher48);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator50 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher54 = new com.yorku.users.Researcher("", "", "hi!");
        double double55 = researcher54.getHourlyRate();
        headLabCoordinator50.approveUser((com.yorku.users.User) researcher54);
        com.yorku.users.Researcher researcher60 = new com.yorku.users.Researcher("", "", "hi!");
        double double61 = researcher60.getHourlyRate();
        headLabCoordinator50.approveUser((com.yorku.users.User) researcher60);
        com.yorku.users.Faculty faculty66 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator50.rejectUser((com.yorku.users.User) faculty66);
        java.lang.String str68 = faculty66.getIdNumber();
        headLabCoordinator19.rejectUser((com.yorku.users.User) faculty66);
        com.yorku.users.User.Status status70 = faculty66.getStatus();
        guest7.setStatus(status70);
        double double72 = guest7.getHourlyRate();
        boolean boolean73 = guest7.isUniversityAffiliated();
        double double74 = guest7.getHourlyRate();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator37);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator50);
        org.junit.Assert.assertTrue("'" + double55 + "' != '" + 20.0d + "'", double55 == 20.0d);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 20.0d + "'", double61 == 20.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + status70 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status70.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 30.0d + "'", double72 == 30.0d);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 30.0d + "'", double74 == 30.0d);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Guest guest10 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double11 = guest10.getHourlyRate();
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getId();
        com.yorku.command.ExtendCommand extendCommand18 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) guest10, equipment15, (int) (short) -1);
        com.yorku.equipment.Equipment equipment19 = equipment15.clone();
        com.yorku.equipment.Equipment equipment20 = equipment19.clone();
        equipment20.setDescription("hi!");
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNotNull(equipment20);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        java.lang.String str20 = equipment17.getId();
        equipment17.setDescription("");
        java.lang.String str23 = equipment17.getDescription();
        com.yorku.equipment.Equipment equipment24 = equipment17.clone();
        com.yorku.equipment.Equipment equipment25 = equipment17.clone();
        boolean boolean26 = equipment17.isAvailable();
        java.lang.Class<?> wildcardClass27 = equipment17.getClass();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(equipment24);
        org.junit.Assert.assertNotNull(equipment25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
        com.yorku.equipment.Equipment equipment3 = new com.yorku.equipment.Equipment("", "hi!", "");
        com.yorku.equipment.Equipment equipment4 = equipment3.clone();
        java.lang.String str5 = equipment3.getDescription();
        org.junit.Assert.assertNotNull(equipment4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        java.lang.String str41 = researcher38.getPassword();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest46 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        java.lang.String str52 = equipment50.getDescription();
        java.lang.String str53 = equipment50.getDescription();
        bookingFacade42.cancelReservation((com.yorku.users.User) guest46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher38, equipment50, (int) (byte) 1);
        com.yorku.users.Student student60 = new com.yorku.users.Student("", "", "");
        double double61 = student60.getHourlyRate();
        com.yorku.users.User.Status status62 = null;
        student60.setStatus(status62);
        com.yorku.booking.BookingFacade bookingFacade64 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest68 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment72 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str73 = equipment72.getLocation();
        java.lang.String str74 = equipment72.getDescription();
        java.lang.String str75 = equipment72.getDescription();
        bookingFacade64.cancelReservation((com.yorku.users.User) guest68, equipment72);
        equipment72.setAvailable(true);
        java.lang.String str79 = equipment72.getDescription();
        com.yorku.command.ExtendCommand extendCommand81 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) student60, equipment72, (int) (byte) 100);
        java.lang.String str82 = student60.getIdNumber();
        boolean boolean83 = student60.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 10.0d + "'", double61 == 10.0d);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        java.lang.String str41 = researcher38.getPassword();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest46 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        java.lang.String str52 = equipment50.getDescription();
        java.lang.String str53 = equipment50.getDescription();
        bookingFacade42.cancelReservation((com.yorku.users.User) guest46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher38, equipment50, (int) (byte) 1);
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest61 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment65 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str66 = equipment65.getLocation();
        java.lang.String str67 = equipment65.getDescription();
        java.lang.String str68 = equipment65.getDescription();
        bookingFacade57.cancelReservation((com.yorku.users.User) guest61, equipment65);
        double double70 = guest61.getHourlyRate();
        java.lang.String str71 = guest61.getIdNumber();
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment75.setDescription("");
        com.yorku.command.CancelCommand cancelCommand78 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest61, equipment75);
        com.yorku.users.Student student82 = new com.yorku.users.Student("hi!", "", "hi!");
        com.yorku.booking.BookingFacade bookingFacade83 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user84 = null;
        com.yorku.equipment.Equipment equipment88 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade83.cancelReservation(user84, equipment88);
        com.yorku.equipment.Equipment equipment90 = equipment88.clone();
        com.yorku.equipment.Equipment equipment91 = equipment90.clone();
        com.yorku.command.CancelCommand cancelCommand92 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student82, equipment91);
        double double93 = student82.getHourlyRate();
        double double94 = student82.getHourlyRate();
        double double95 = student82.getHourlyRate();
        com.yorku.users.User.Status status96 = student82.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 30.0d + "'", double70 == 30.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(equipment90);
        org.junit.Assert.assertNotNull(equipment91);
        org.junit.Assert.assertTrue("'" + double93 + "' != '" + 10.0d + "'", double93 == 10.0d);
        org.junit.Assert.assertTrue("'" + double94 + "' != '" + 10.0d + "'", double94 == 10.0d);
        org.junit.Assert.assertTrue("'" + double95 + "' != '" + 10.0d + "'", double95 == 10.0d);
        org.junit.Assert.assertTrue("'" + status96 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status96.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor11 = new com.yorku.observer.Sensor();
        sensor11.notifyObservers("");
        sensor11.notifyObservers("");
        sensor11.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor18 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor19 = new com.yorku.observer.EquipmentMonitor();
        sensor18.attach((com.yorku.observer.Observer) equipmentMonitor19);
        sensor18.detectUsage("hi!");
        sensor18.detectUsage("");
        com.yorku.observer.Sensor sensor25 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor26 = new com.yorku.observer.EquipmentMonitor();
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor26);
        sensor25.detectUsage("hi!");
        sensor25.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor32 = new com.yorku.observer.EquipmentMonitor();
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor32);
        sensor18.attach((com.yorku.observer.Observer) equipmentMonitor32);
        com.yorku.observer.Sensor sensor35 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor36 = new com.yorku.observer.EquipmentMonitor();
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor36);
        equipmentMonitor36.update("hi!");
        equipmentMonitor36.update("");
        sensor18.attach((com.yorku.observer.Observer) equipmentMonitor36);
        equipmentMonitor36.update("");
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor36);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor36);
        sensor0.notifyObservers("");
        sensor0.detectUsage("");
        com.yorku.observer.Sensor sensor51 = new com.yorku.observer.Sensor();
        sensor51.notifyObservers("");
        sensor51.notifyObservers("");
        sensor51.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor58 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor59 = new com.yorku.observer.EquipmentMonitor();
        sensor58.attach((com.yorku.observer.Observer) equipmentMonitor59);
        sensor58.detectUsage("hi!");
        sensor58.detectUsage("");
        com.yorku.observer.Sensor sensor65 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor66 = new com.yorku.observer.EquipmentMonitor();
        sensor65.attach((com.yorku.observer.Observer) equipmentMonitor66);
        sensor65.detectUsage("hi!");
        sensor65.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor72 = new com.yorku.observer.EquipmentMonitor();
        sensor65.attach((com.yorku.observer.Observer) equipmentMonitor72);
        sensor58.attach((com.yorku.observer.Observer) equipmentMonitor72);
        com.yorku.observer.Sensor sensor75 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor76 = new com.yorku.observer.EquipmentMonitor();
        sensor75.attach((com.yorku.observer.Observer) equipmentMonitor76);
        equipmentMonitor76.update("hi!");
        equipmentMonitor76.update("");
        sensor58.attach((com.yorku.observer.Observer) equipmentMonitor76);
        equipmentMonitor76.update("");
        sensor51.attach((com.yorku.observer.Observer) equipmentMonitor76);
        equipmentMonitor76.update("");
        equipmentMonitor76.update("hi!");
        equipmentMonitor76.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor76);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.equipment.Equipment equipment7 = equipment5.clone();
        com.yorku.equipment.Equipment equipment8 = equipment7.clone();
        equipment8.setLocation("");
        com.yorku.equipment.Equipment equipment11 = equipment8.clone();
        java.lang.String str12 = equipment8.getLocation();
        java.lang.String str13 = equipment8.getLocation();
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertNotNull(equipment8);
        org.junit.Assert.assertNotNull(equipment11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.util.List<java.lang.String> strList11 = labManager1.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade12 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user13 = null;
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade12.cancelReservation(user13, equipment17);
        com.yorku.users.Faculty faculty22 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade23 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user24 = null;
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade23.cancelReservation(user24, equipment28);
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.equipment.Equipment equipment31 = equipment30.clone();
        equipment31.setLocation("");
        com.yorku.command.CancelCommand cancelCommand34 = new com.yorku.command.CancelCommand(bookingFacade12, (com.yorku.users.User) faculty22, equipment31);
        com.yorku.users.UserRegistry userRegistry35 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher39 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status40 = null;
        researcher39.setStatus(status40);
        double double42 = researcher39.getHourlyRate();
        java.lang.String str43 = researcher39.getPassword();
        userRegistry35.registerUser((com.yorku.users.User) researcher39);
        com.yorku.users.User user46 = userRegistry35.getUserByEmail("");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        equipment50.setAvailable(true);
        bookingFacade12.reserveEquipment(user46, equipment50, (int) ' ');
        labManager1.addEquipment(equipment50);
        java.lang.String str57 = labManager1.getPassword();
        java.util.List<java.lang.String> strList58 = labManager1.getAllEquipmentIds();
        java.util.List<java.lang.String> strList59 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertNotNull(userRegistry35);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(strList59);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.util.List<java.lang.String> strList11 = labManager1.getAllEquipmentIds();
        labManager1.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.coordinator.LabManager labManager11 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        com.yorku.coordinator.LabManager labManager16 = headLabCoordinator0.generateLabManager("", "", "hi!", "");
        com.yorku.users.Researcher researcher20 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status21 = null;
        researcher20.setStatus(status21);
        boolean boolean23 = researcher20.isUniversityAffiliated();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher20);
        com.yorku.booking.BookingFacade bookingFacade25 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user26 = null;
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade25.cancelReservation(user26, equipment30);
        com.yorku.users.Researcher researcher35 = new com.yorku.users.Researcher("", "", "hi!");
        double double36 = researcher35.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade37 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user38 = null;
        com.yorku.equipment.Equipment equipment42 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade37.cancelReservation(user38, equipment42);
        com.yorku.equipment.Equipment equipment44 = equipment42.clone();
        com.yorku.equipment.Equipment equipment45 = equipment44.clone();
        bookingFacade25.reserveEquipment((com.yorku.users.User) researcher35, equipment44, 1);
        java.lang.String str48 = researcher35.getPassword();
        double double49 = researcher35.getHourlyRate();
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher35);
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertNotNull(equipment44);
        org.junit.Assert.assertNotNull(equipment45);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 20.0d + "'", double49 == 20.0d);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        com.yorku.users.Guest guest3 = new com.yorku.users.Guest("hi!", "hi!", "");
        java.lang.Class<?> wildcardClass4 = guest3.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        equipment20.setLocation("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        java.lang.String str8 = researcher5.getPassword();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher5);
        com.yorku.coordinator.LabManager labManager14 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        java.util.List<com.yorku.users.User> userList15 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.UserRegistry userRegistry16 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean18 = userRegistry16.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade19 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest23 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment27 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str28 = equipment27.getLocation();
        java.lang.String str29 = equipment27.getDescription();
        java.lang.String str30 = equipment27.getDescription();
        bookingFacade19.cancelReservation((com.yorku.users.User) guest23, equipment27);
        userRegistry16.registerUser((com.yorku.users.User) guest23);
        com.yorku.users.User.Status status33 = null;
        guest23.setStatus(status33);
        double double35 = guest23.getHourlyRate();
        java.lang.String str36 = guest23.getIdNumber();
        double double37 = guest23.getHourlyRate();
        java.lang.String str38 = guest23.getEmail();
        headLabCoordinator0.rejectUser((com.yorku.users.User) guest23);
        java.util.List<com.yorku.users.User> userList40 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.Faculty faculty44 = new com.yorku.users.Faculty("hi!", "hi!", "hi!");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean45 = headLabCoordinator0.registerUser((com.yorku.users.User) faculty44);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Email already registered");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userRegistry16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + double35 + "' != '" + 30.0d + "'", double35 == 30.0d);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 30.0d + "'", double37 == 30.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(userList40);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user14 = null;
        com.yorku.equipment.Equipment equipment18 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade13.cancelReservation(user14, equipment18);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade24 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user25 = null;
        com.yorku.equipment.Equipment equipment29 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade24.cancelReservation(user25, equipment29);
        com.yorku.equipment.Equipment equipment31 = equipment29.clone();
        com.yorku.equipment.Equipment equipment32 = equipment31.clone();
        equipment32.setLocation("");
        com.yorku.command.CancelCommand cancelCommand35 = new com.yorku.command.CancelCommand(bookingFacade13, (com.yorku.users.User) faculty23, equipment32);
        com.yorku.users.UserRegistry userRegistry36 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher40 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status41 = null;
        researcher40.setStatus(status41);
        double double43 = researcher40.getHourlyRate();
        java.lang.String str44 = researcher40.getPassword();
        userRegistry36.registerUser((com.yorku.users.User) researcher40);
        com.yorku.users.User user47 = userRegistry36.getUserByEmail("");
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str52 = equipment51.getLocation();
        equipment51.setAvailable(true);
        bookingFacade13.reserveEquipment(user47, equipment51, (int) ' ');
        com.yorku.command.CancelCommand cancelCommand57 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment51);
        equipment51.setLocation("hi!");
        boolean boolean60 = equipment51.isAvailable();
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertNotNull(equipment32);
        org.junit.Assert.assertNotNull(userRegistry36);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 20.0d + "'", double43 == 20.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection12 = labManager1.getAllEquipment();
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator14 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher18 = new com.yorku.users.Researcher("", "", "hi!");
        double double19 = researcher18.getHourlyRate();
        headLabCoordinator14.approveUser((com.yorku.users.User) researcher18);
        com.yorku.users.Researcher researcher24 = new com.yorku.users.Researcher("", "", "hi!");
        double double25 = researcher24.getHourlyRate();
        headLabCoordinator14.approveUser((com.yorku.users.User) researcher24);
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getId();
        com.yorku.command.CancelCommand cancelCommand32 = new com.yorku.command.CancelCommand(bookingFacade13, (com.yorku.users.User) researcher24, equipment30);
        equipment30.setAvailable(false);
        java.lang.String str35 = equipment30.getId();
        equipment30.setAvailable(true);
        labManager1.addEquipment(equipment30);
        java.lang.String str39 = labManager1.getPassword();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentCollection12);
        org.junit.Assert.assertNotNull(headLabCoordinator14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 20.0d + "'", double25 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
        com.yorku.booking.BookingFacade bookingFacade0 = null;
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Student student11 = new com.yorku.users.Student("", "", "");
        java.lang.String str12 = student11.getIdNumber();
        double double13 = student11.getHourlyRate();
        java.lang.String str14 = student11.getEmail();
        headLabCoordinator1.approveUser((com.yorku.users.User) student11);
        java.lang.String str16 = student11.getEmail();
        com.yorku.booking.BookingFacade bookingFacade17 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user18 = null;
        com.yorku.equipment.Equipment equipment22 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade17.cancelReservation(user18, equipment22);
        java.lang.String str24 = equipment22.getLocation();
        boolean boolean25 = equipment22.isAvailable();
        com.yorku.equipment.Equipment equipment26 = equipment22.clone();
        com.yorku.command.CancelCommand cancelCommand27 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student11, equipment26);
        java.lang.String str28 = student11.getIdNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 10.0d + "'", double13 == 10.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(equipment26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList10 = labManager1.getAllEquipmentIds();
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        java.lang.String str12 = labManager1.getEmail();
        java.util.List<java.lang.String> strList13 = labManager1.getAllEquipmentIds();
        labManager1.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        java.lang.String str41 = researcher38.getPassword();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest46 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        java.lang.String str52 = equipment50.getDescription();
        java.lang.String str53 = equipment50.getDescription();
        bookingFacade42.cancelReservation((com.yorku.users.User) guest46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher38, equipment50, (int) (byte) 1);
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest61 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment65 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str66 = equipment65.getLocation();
        java.lang.String str67 = equipment65.getDescription();
        java.lang.String str68 = equipment65.getDescription();
        bookingFacade57.cancelReservation((com.yorku.users.User) guest61, equipment65);
        double double70 = guest61.getHourlyRate();
        java.lang.String str71 = guest61.getIdNumber();
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment75.setDescription("");
        com.yorku.command.CancelCommand cancelCommand78 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest61, equipment75);
        com.yorku.users.Student student82 = new com.yorku.users.Student("hi!", "", "hi!");
        com.yorku.booking.BookingFacade bookingFacade83 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user84 = null;
        com.yorku.equipment.Equipment equipment88 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade83.cancelReservation(user84, equipment88);
        com.yorku.equipment.Equipment equipment90 = equipment88.clone();
        com.yorku.equipment.Equipment equipment91 = equipment90.clone();
        com.yorku.command.CancelCommand cancelCommand92 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student82, equipment91);
        equipment91.setLocation("");
        java.lang.String str95 = equipment91.getDescription();
        equipment91.setAvailable(false);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 30.0d + "'", double70 == 30.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(equipment90);
        org.junit.Assert.assertNotNull(equipment91);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor7 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor7);
        sensor0.detectUsage("");
        com.yorku.observer.Sensor sensor11 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor12 = new com.yorku.observer.EquipmentMonitor();
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor12);
        sensor11.detectUsage("hi!");
        com.yorku.observer.Sensor sensor16 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor17 = new com.yorku.observer.EquipmentMonitor();
        sensor16.attach((com.yorku.observer.Observer) equipmentMonitor17);
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor17);
        com.yorku.observer.Sensor sensor20 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor21 = new com.yorku.observer.EquipmentMonitor();
        sensor20.attach((com.yorku.observer.Observer) equipmentMonitor21);
        com.yorku.observer.EquipmentMonitor equipmentMonitor23 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor23.update("");
        sensor20.attach((com.yorku.observer.Observer) equipmentMonitor23);
        com.yorku.observer.Sensor sensor27 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor28 = new com.yorku.observer.EquipmentMonitor();
        sensor27.attach((com.yorku.observer.Observer) equipmentMonitor28);
        equipmentMonitor28.update("");
        sensor20.attach((com.yorku.observer.Observer) equipmentMonitor28);
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor28);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor28);
        com.yorku.observer.Sensor sensor35 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor36 = new com.yorku.observer.EquipmentMonitor();
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor36);
        equipmentMonitor36.update("hi!");
        equipmentMonitor36.update("");
        equipmentMonitor36.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor36);
        com.yorku.observer.Sensor sensor45 = new com.yorku.observer.Sensor();
        sensor45.notifyObservers("");
        sensor45.notifyObservers("");
        sensor45.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor52 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor53 = new com.yorku.observer.EquipmentMonitor();
        sensor52.attach((com.yorku.observer.Observer) equipmentMonitor53);
        sensor52.detectUsage("hi!");
        com.yorku.observer.Sensor sensor57 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor58 = new com.yorku.observer.EquipmentMonitor();
        sensor57.attach((com.yorku.observer.Observer) equipmentMonitor58);
        sensor52.attach((com.yorku.observer.Observer) equipmentMonitor58);
        com.yorku.observer.Sensor sensor61 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor62 = new com.yorku.observer.EquipmentMonitor();
        sensor61.attach((com.yorku.observer.Observer) equipmentMonitor62);
        com.yorku.observer.EquipmentMonitor equipmentMonitor64 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor64.update("");
        sensor61.attach((com.yorku.observer.Observer) equipmentMonitor64);
        com.yorku.observer.Sensor sensor68 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor69 = new com.yorku.observer.EquipmentMonitor();
        sensor68.attach((com.yorku.observer.Observer) equipmentMonitor69);
        equipmentMonitor69.update("");
        sensor61.attach((com.yorku.observer.Observer) equipmentMonitor69);
        sensor52.attach((com.yorku.observer.Observer) equipmentMonitor69);
        sensor52.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor77 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor78 = new com.yorku.observer.EquipmentMonitor();
        sensor77.attach((com.yorku.observer.Observer) equipmentMonitor78);
        sensor77.detectUsage("hi!");
        sensor77.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor84 = new com.yorku.observer.EquipmentMonitor();
        sensor77.attach((com.yorku.observer.Observer) equipmentMonitor84);
        sensor52.attach((com.yorku.observer.Observer) equipmentMonitor84);
        sensor45.attach((com.yorku.observer.Observer) equipmentMonitor84);
        equipmentMonitor84.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor84);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        java.lang.String str41 = researcher38.getPassword();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest46 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        java.lang.String str52 = equipment50.getDescription();
        java.lang.String str53 = equipment50.getDescription();
        bookingFacade42.cancelReservation((com.yorku.users.User) guest46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher38, equipment50, (int) (byte) 1);
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest61 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment65 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str66 = equipment65.getLocation();
        java.lang.String str67 = equipment65.getDescription();
        java.lang.String str68 = equipment65.getDescription();
        bookingFacade57.cancelReservation((com.yorku.users.User) guest61, equipment65);
        double double70 = guest61.getHourlyRate();
        java.lang.String str71 = guest61.getIdNumber();
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment75.setDescription("");
        com.yorku.command.CancelCommand cancelCommand78 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest61, equipment75);
        com.yorku.users.Student student82 = new com.yorku.users.Student("hi!", "", "hi!");
        com.yorku.booking.BookingFacade bookingFacade83 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user84 = null;
        com.yorku.equipment.Equipment equipment88 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade83.cancelReservation(user84, equipment88);
        com.yorku.equipment.Equipment equipment90 = equipment88.clone();
        com.yorku.equipment.Equipment equipment91 = equipment90.clone();
        com.yorku.command.CancelCommand cancelCommand92 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student82, equipment91);
        java.lang.String str93 = equipment91.getId();
        equipment91.setDescription("hi!");
        boolean boolean96 = equipment91.isAvailable();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 30.0d + "'", double70 == 30.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(equipment90);
        org.junit.Assert.assertNotNull(equipment91);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "hi!" + "'", str93, "hi!");
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + true + "'", boolean96 == true);
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.reserve();
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.UserRegistry userRegistry3 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean5 = userRegistry3.isEmailRegistered("");
        boolean boolean7 = userRegistry3.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade8 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest12 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str17 = equipment16.getLocation();
        java.lang.String str18 = equipment16.getDescription();
        java.lang.String str19 = equipment16.getDescription();
        bookingFacade8.cancelReservation((com.yorku.users.User) guest12, equipment16);
        double double21 = guest12.getHourlyRate();
        java.lang.String str22 = guest12.getIdNumber();
        com.yorku.users.User.Status status23 = null;
        guest12.setStatus(status23);
        userRegistry3.registerUser((com.yorku.users.User) guest12);
        java.lang.String str26 = guest12.getIdNumber();
        userRegistry0.registerUser((com.yorku.users.User) guest12);
        boolean boolean29 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean31 = userRegistry0.isEmailRegistered("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userRegistry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
// flaky "12) test1613(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.users.UserRegistry userRegistry34 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean36 = userRegistry34.isEmailRegistered("");
        boolean boolean38 = userRegistry34.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade39 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest43 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str48 = equipment47.getLocation();
        java.lang.String str49 = equipment47.getDescription();
        java.lang.String str50 = equipment47.getDescription();
        bookingFacade39.cancelReservation((com.yorku.users.User) guest43, equipment47);
        double double52 = guest43.getHourlyRate();
        java.lang.String str53 = guest43.getIdNumber();
        com.yorku.users.User.Status status54 = null;
        guest43.setStatus(status54);
        userRegistry34.registerUser((com.yorku.users.User) guest43);
        java.lang.String str57 = guest43.getIdNumber();
        java.lang.String str58 = guest43.getEmail();
        com.yorku.booking.BookingFacade bookingFacade59 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user60 = null;
        com.yorku.equipment.Equipment equipment64 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade59.cancelReservation(user60, equipment64);
        com.yorku.users.Researcher researcher69 = new com.yorku.users.Researcher("", "", "hi!");
        double double70 = researcher69.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.equipment.Equipment equipment78 = equipment76.clone();
        com.yorku.equipment.Equipment equipment79 = equipment78.clone();
        bookingFacade59.reserveEquipment((com.yorku.users.User) researcher69, equipment78, 1);
        java.lang.String str82 = equipment78.getDescription();
        java.lang.String str83 = equipment78.getId();
        boolean boolean84 = equipment78.isAvailable();
        equipment78.setAvailable(false);
        com.yorku.command.ReserveCommand reserveCommand88 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) guest43, equipment78, (int) (short) 1);
        reserveCommand88.execute();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(userRegistry34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 30.0d + "'", double52 == 30.0d);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 20.0d + "'", double70 == 20.0d);
        org.junit.Assert.assertNotNull(equipment78);
        org.junit.Assert.assertNotNull(equipment79);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        java.util.List<java.lang.String> strList10 = labManager1.getAllEquipmentIds();
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        java.lang.String str12 = labManager1.getName();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator13 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher17 = new com.yorku.users.Researcher("", "", "hi!");
        double double18 = researcher17.getHourlyRate();
        headLabCoordinator13.approveUser((com.yorku.users.User) researcher17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        double double24 = researcher23.getHourlyRate();
        headLabCoordinator13.approveUser((com.yorku.users.User) researcher23);
        com.yorku.users.Faculty faculty29 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator13.rejectUser((com.yorku.users.User) faculty29);
        java.util.List<com.yorku.users.User> userList31 = headLabCoordinator13.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList32 = headLabCoordinator13.getPendingApprovals();
        com.yorku.users.User user33 = null;
        headLabCoordinator13.rejectUser(user33);
        com.yorku.coordinator.LabManager labManager39 = headLabCoordinator13.generateLabManager("", "", "hi!", "hi!");
        java.lang.String str40 = labManager39.getName();
        com.yorku.equipment.Equipment equipment44 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str45 = equipment44.getLocation();
        java.lang.String str46 = equipment44.getDescription();
        boolean boolean47 = equipment44.isAvailable();
        boolean boolean48 = equipment44.isAvailable();
        labManager39.addEquipment(equipment44);
        labManager1.addEquipment(equipment44);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(headLabCoordinator13);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertNotNull(userList31);
        org.junit.Assert.assertNotNull(userList32);
        org.junit.Assert.assertNotNull(labManager39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Faculty faculty10 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade11.cancelReservation(user12, equipment16);
        com.yorku.equipment.Equipment equipment18 = equipment16.clone();
        com.yorku.equipment.Equipment equipment19 = equipment18.clone();
        equipment19.setLocation("");
        com.yorku.command.CancelCommand cancelCommand22 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty10, equipment19);
        com.yorku.users.Faculty faculty26 = new com.yorku.users.Faculty("", "hi!", "hi!");
        double double27 = faculty26.getHourlyRate();
        double double28 = faculty26.getHourlyRate();
        java.lang.String str29 = faculty26.getEmail();
        com.yorku.coordinator.LabManager labManager31 = new com.yorku.coordinator.LabManager("");
        labManager31.markForMaintenance("hi!");
        labManager31.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList36 = labManager31.getAvailableEquipment();
        labManager31.disableEquipment("");
        labManager31.enableEquipment("hi!");
        com.yorku.equipment.Equipment equipment42 = labManager31.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("", "hi!", "hi!");
        labManager31.addEquipment(equipment46);
        bookingFacade0.cancelReservation((com.yorku.users.User) faculty26, equipment46);
        com.yorku.users.Guest guest52 = new com.yorku.users.Guest("hi!", "", "");
        java.lang.String str53 = guest52.getIdNumber();
        com.yorku.booking.BookingFacade bookingFacade54 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user55 = null;
        com.yorku.equipment.Equipment equipment59 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade54.cancelReservation(user55, equipment59);
        com.yorku.equipment.Equipment equipment61 = equipment59.clone();
        com.yorku.equipment.Equipment equipment62 = equipment61.clone();
        equipment62.setLocation("");
        equipment62.setAvailable(false);
        com.yorku.command.ExtendCommand extendCommand68 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) guest52, equipment62, 0);
        extendCommand68.execute();
        org.junit.Assert.assertNotNull(equipment18);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 15.0d + "'", double27 == 15.0d);
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 15.0d + "'", double28 == 15.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipmentList36);
        org.junit.Assert.assertNull(equipment42);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(equipment61);
        org.junit.Assert.assertNotNull(equipment62);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        com.yorku.equipment.Equipment equipment11 = labManager1.getEquipmentById("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList12 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment14 = labManager1.getEquipment("hi!");
        labManager1.markForMaintenance("");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNull(equipment14);
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment8 = labManager1.getEquipment("hi!");
        java.lang.String str9 = labManager1.getName();
        com.yorku.equipment.Equipment equipment11 = labManager1.getEquipment("hi!");
        java.lang.String str12 = labManager1.getPassword();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection13 = labManager1.getAllEquipment();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(equipmentCollection13);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        boolean boolean8 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status13 = null;
        researcher12.setStatus(status13);
        com.yorku.users.User.Status status15 = null;
        researcher12.setStatus(status15);
        com.yorku.users.User.Status status17 = researcher12.getStatus();
        userRegistry0.registerUser((com.yorku.users.User) researcher12);
        boolean boolean20 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user22 = userRegistry0.getUserByEmail("");
        com.yorku.users.User user24 = userRegistry0.getUserByEmail("");
        boolean boolean26 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user28 = userRegistry0.getUserByEmail("");
        boolean boolean30 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator31 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher35 = new com.yorku.users.Researcher("", "", "hi!");
        double double36 = researcher35.getHourlyRate();
        headLabCoordinator31.approveUser((com.yorku.users.User) researcher35);
        com.yorku.users.Researcher researcher41 = new com.yorku.users.Researcher("", "", "hi!");
        double double42 = researcher41.getHourlyRate();
        headLabCoordinator31.approveUser((com.yorku.users.User) researcher41);
        com.yorku.users.Faculty faculty47 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator31.rejectUser((com.yorku.users.User) faculty47);
        java.util.List<com.yorku.users.User> userList49 = headLabCoordinator31.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList50 = headLabCoordinator31.getPendingApprovals();
        com.yorku.users.User user51 = null;
        headLabCoordinator31.rejectUser(user51);
        com.yorku.coordinator.LabManager labManager57 = headLabCoordinator31.generateLabManager("", "", "hi!", "hi!");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator58 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher62 = new com.yorku.users.Researcher("", "", "hi!");
        double double63 = researcher62.getHourlyRate();
        headLabCoordinator58.approveUser((com.yorku.users.User) researcher62);
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator58.approveUser((com.yorku.users.User) researcher68);
        com.yorku.users.Faculty faculty74 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator58.rejectUser((com.yorku.users.User) faculty74);
        java.lang.String str76 = faculty74.getIdNumber();
        java.lang.String str77 = faculty74.getEmail();
        java.lang.String str78 = faculty74.getEmail();
        headLabCoordinator31.approveUser((com.yorku.users.User) faculty74);
        double double80 = faculty74.getHourlyRate();
        userRegistry0.registerUser((com.yorku.users.User) faculty74);
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "13) test1619(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(status17);
// flaky "7) test1619(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user24);
// flaky "5) test1619(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(user28);
// flaky "4) test1619(Randoop.RegressionTest3)":         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertNotNull(userList49);
        org.junit.Assert.assertNotNull(userList50);
        org.junit.Assert.assertNotNull(labManager57);
        org.junit.Assert.assertNotNull(headLabCoordinator58);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 20.0d + "'", double63 == 20.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 15.0d + "'", double80 == 15.0d);
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.Faculty faculty8 = new com.yorku.users.Faculty("hi!", "", "hi!");
        userRegistry0.registerUser((com.yorku.users.User) faculty8);
        boolean boolean11 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user13 = userRegistry0.getUserByEmail("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
// flaky "14) test1620(Randoop.RegressionTest3)":         org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(user13);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
        com.yorku.equipment.Equipment equipment3 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str4 = equipment3.getLocation();
        java.lang.String str5 = equipment3.getId();
        java.lang.String str6 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator7 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator7.approveUser((com.yorku.users.User) researcher11);
        com.yorku.users.Researcher researcher17 = new com.yorku.users.Researcher("", "", "hi!");
        double double18 = researcher17.getHourlyRate();
        headLabCoordinator7.approveUser((com.yorku.users.User) researcher17);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator7.rejectUser((com.yorku.users.User) faculty23);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator25 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher29 = new com.yorku.users.Researcher("", "", "hi!");
        double double30 = researcher29.getHourlyRate();
        headLabCoordinator25.approveUser((com.yorku.users.User) researcher29);
        headLabCoordinator7.rejectUser((com.yorku.users.User) researcher29);
        com.yorku.users.Faculty faculty36 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean37 = faculty36.isUniversityAffiliated();
        headLabCoordinator7.approveUser((com.yorku.users.User) faculty36);
        com.yorku.booking.BookingFacade bookingFacade39 = null;
        com.yorku.users.Researcher researcher43 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status44 = null;
        researcher43.setStatus(status44);
        com.yorku.users.User.Status status46 = null;
        researcher43.setStatus(status46);
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment51.setDescription("");
        java.lang.String str54 = equipment51.getDescription();
        equipment51.setAvailable(false);
        com.yorku.command.ReserveCommand reserveCommand58 = new com.yorku.command.ReserveCommand(bookingFacade39, (com.yorku.users.User) researcher43, equipment51, (int) (byte) 100);
        java.lang.String str59 = equipment51.getId();
        com.yorku.command.ReserveCommand reserveCommand61 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) faculty36, equipment51, (int) (byte) 0);
        com.yorku.booking.BookingFacade bookingFacade62 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest66 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment70 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str71 = equipment70.getLocation();
        java.lang.String str72 = equipment70.getDescription();
        java.lang.String str73 = equipment70.getDescription();
        bookingFacade62.cancelReservation((com.yorku.users.User) guest66, equipment70);
        double double75 = guest66.getHourlyRate();
        java.lang.String str76 = guest66.getIdNumber();
        com.yorku.users.User.Status status77 = null;
        guest66.setStatus(status77);
        com.yorku.equipment.Equipment equipment82 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str83 = equipment82.getDescription();
        com.yorku.equipment.Equipment equipment84 = equipment82.clone();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest66, equipment84);
        java.lang.String str86 = guest66.getEmail();
        boolean boolean87 = guest66.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertEquals("'" + str72 + "' != '" + "" + "'", str72, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 30.0d + "'", double75 == 30.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertNotNull(equipment84);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        userRegistry0.registerUser((com.yorku.users.User) researcher30);
        com.yorku.users.User user61 = userRegistry0.getUserByEmail("");
        com.yorku.users.UserRegistry userRegistry62 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean64 = userRegistry62.isEmailRegistered("");
        com.yorku.users.User user66 = userRegistry62.getUserByEmail("hi!");
        boolean boolean68 = userRegistry62.isEmailRegistered("");
        boolean boolean70 = userRegistry62.isEmailRegistered("");
        com.yorku.users.Researcher researcher74 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status75 = null;
        researcher74.setStatus(status75);
        com.yorku.users.User.Status status77 = null;
        researcher74.setStatus(status77);
        com.yorku.users.User.Status status79 = researcher74.getStatus();
        userRegistry62.registerUser((com.yorku.users.User) researcher74);
        boolean boolean81 = researcher74.isUniversityAffiliated();
        java.lang.String str82 = researcher74.getIdNumber();
        userRegistry0.registerUser((com.yorku.users.User) researcher74);
        com.yorku.users.Student student87 = new com.yorku.users.Student("", "", "");
        double double88 = student87.getHourlyRate();
        com.yorku.users.User.Status status89 = null;
        student87.setStatus(status89);
        userRegistry0.registerUser((com.yorku.users.User) student87);
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(userRegistry62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(user66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNull(status79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "hi!" + "'", str82, "hi!");
        org.junit.Assert.assertTrue("'" + double88 + "' != '" + 10.0d + "'", double88 == 10.0d);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        java.lang.String str34 = researcher23.getIdNumber();
        com.yorku.users.UserRegistry userRegistry35 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean37 = userRegistry35.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade38 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest42 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str47 = equipment46.getLocation();
        java.lang.String str48 = equipment46.getDescription();
        java.lang.String str49 = equipment46.getDescription();
        bookingFacade38.cancelReservation((com.yorku.users.User) guest42, equipment46);
        userRegistry35.registerUser((com.yorku.users.User) guest42);
        com.yorku.users.User.Status status52 = guest42.getStatus();
        com.yorku.users.User.Status status53 = guest42.getStatus();
        double double54 = guest42.getHourlyRate();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator55 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator56 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher60 = new com.yorku.users.Researcher("", "", "hi!");
        double double61 = researcher60.getHourlyRate();
        headLabCoordinator56.approveUser((com.yorku.users.User) researcher60);
        java.lang.String str63 = researcher60.getPassword();
        headLabCoordinator55.approveUser((com.yorku.users.User) researcher60);
        boolean boolean65 = researcher60.isUniversityAffiliated();
        java.lang.String str66 = researcher60.getEmail();
        com.yorku.users.UserRegistry userRegistry67 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean69 = userRegistry67.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade70 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest74 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment78 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str79 = equipment78.getLocation();
        java.lang.String str80 = equipment78.getDescription();
        java.lang.String str81 = equipment78.getDescription();
        bookingFacade70.cancelReservation((com.yorku.users.User) guest74, equipment78);
        userRegistry67.registerUser((com.yorku.users.User) guest74);
        com.yorku.users.User.Status status84 = guest74.getStatus();
        com.yorku.users.User.Status status85 = guest74.getStatus();
        researcher60.setStatus(status85);
        guest42.setStatus(status85);
        researcher23.setStatus(status85);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(userRegistry35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + status52 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status52.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + status53 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status53.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 30.0d + "'", double54 == 30.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator55);
        org.junit.Assert.assertNotNull(headLabCoordinator56);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 20.0d + "'", double61 == 20.0d);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertNotNull(userRegistry67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "" + "'", str80, "");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "" + "'", str81, "");
        org.junit.Assert.assertTrue("'" + status84 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status84.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + status85 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status85.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        java.lang.String str20 = equipment17.getId();
        equipment17.setDescription("");
        java.lang.String str23 = equipment17.getDescription();
        com.yorku.equipment.Equipment equipment24 = equipment17.clone();
        com.yorku.equipment.Equipment equipment25 = equipment17.clone();
        boolean boolean26 = equipment17.isAvailable();
        equipment17.setAvailable(true);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(equipment24);
        org.junit.Assert.assertNotNull(equipment25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status11 = null;
        researcher10.setStatus(status11);
        boolean boolean13 = researcher10.isUniversityAffiliated();
        java.lang.String str14 = researcher10.getIdNumber();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator15 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher19 = new com.yorku.users.Researcher("", "", "hi!");
        double double20 = researcher19.getHourlyRate();
        headLabCoordinator15.approveUser((com.yorku.users.User) researcher19);
        java.lang.String str22 = researcher19.getPassword();
        com.yorku.users.User.Status status23 = researcher19.getStatus();
        researcher10.setStatus(status23);
        com.yorku.coordinator.LabManager labManager26 = new com.yorku.coordinator.LabManager("");
        labManager26.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList29 = labManager26.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection30 = labManager26.getAllEquipment();
        java.lang.String str31 = labManager26.getPassword();
        com.yorku.equipment.Equipment equipment33 = labManager26.getEquipment("");
        com.yorku.equipment.Equipment equipment37 = new com.yorku.equipment.Equipment("hi!", "", "");
        equipment37.setDescription("hi!");
        labManager26.addEquipment(equipment37);
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher10, equipment37);
        java.lang.String str42 = researcher10.getPassword();
        double double43 = researcher10.getHourlyRate();
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator15);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 20.0d + "'", double20 == 20.0d);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + status23 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status23.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(equipmentCollection30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(equipment33);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 20.0d + "'", double43 == 20.0d);
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade5 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user6 = null;
        com.yorku.equipment.Equipment equipment10 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade5.cancelReservation(user6, equipment10);
        com.yorku.equipment.Equipment equipment12 = equipment10.clone();
        equipment12.setAvailable(true);
        labManager1.addEquipment(equipment12);
        java.util.List<com.yorku.equipment.Equipment> equipmentList16 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("hi!");
        com.yorku.equipment.Equipment equipment22 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str23 = equipment22.getLocation();
        labManager1.addEquipment(equipment22);
        equipment22.setLocation("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipment12);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.coordinator.LabManager labManager11 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        com.yorku.coordinator.LabManager labManager16 = headLabCoordinator0.generateLabManager("", "", "hi!", "");
        java.util.List<com.yorku.users.User> userList17 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.User user18 = null;
        headLabCoordinator0.rejectUser(user18);
        java.util.List<com.yorku.users.User> userList20 = headLabCoordinator0.getPendingApprovals();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(labManager16);
        org.junit.Assert.assertNotNull(userList17);
        org.junit.Assert.assertNotNull(userList20);
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList10 = labManager1.getAllEquipmentIds();
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.lang.String str14 = labManager1.getPassword();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.users.Researcher researcher29 = new com.yorku.users.Researcher("hi!", "hi!", "hi!");
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher29);
        com.yorku.coordinator.LabManager labManager35 = headLabCoordinator0.generateLabManager("", "", "hi!", "");
        java.util.List<java.lang.String> strList36 = labManager35.getAllEquipmentIds();
        com.yorku.coordinator.LabManager labManager38 = new com.yorku.coordinator.LabManager("");
        labManager38.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList41 = labManager38.getAllEquipmentIds();
        labManager38.enableEquipment("hi!");
        java.lang.String str44 = labManager38.getName();
        labManager38.markForMaintenance("");
        labManager38.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment52 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str53 = equipment52.getLocation();
        labManager38.addEquipment(equipment52);
        java.lang.String str55 = equipment52.getLocation();
        com.yorku.equipment.Equipment equipment56 = equipment52.clone();
        labManager35.addEquipment(equipment52);
        java.lang.String str58 = labManager35.getPassword();
        java.lang.String str59 = labManager35.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(labManager35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertNotNull(equipment56);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection12 = labManager1.getAllEquipment();
        java.lang.String str13 = labManager1.getName();
        labManager1.markForMaintenance("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList16 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment18 = labManager1.getEquipment("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentCollection12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNull(equipment18);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        labManager1.disableEquipment("");
        java.lang.String str12 = labManager1.getEmail();
        labManager1.enableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList15 = labManager1.getAvailableEquipment();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(equipmentList15);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.UserRegistry userRegistry3 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean5 = userRegistry3.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade6 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest10 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str15 = equipment14.getLocation();
        java.lang.String str16 = equipment14.getDescription();
        java.lang.String str17 = equipment14.getDescription();
        bookingFacade6.cancelReservation((com.yorku.users.User) guest10, equipment14);
        userRegistry3.registerUser((com.yorku.users.User) guest10);
        com.yorku.users.User.Status status20 = null;
        guest10.setStatus(status20);
        userRegistry0.registerUser((com.yorku.users.User) guest10);
        boolean boolean24 = userRegistry0.isEmailRegistered("hi!");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(userRegistry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.coordinator.LabManager labManager30 = headLabCoordinator0.generateLabManager("hi!", "", "", "hi!");
        java.lang.String str31 = labManager30.getPassword();
        java.lang.String str32 = labManager30.getPassword();
        com.yorku.equipment.Equipment equipment34 = labManager30.getEquipment("");
        java.lang.String str35 = labManager30.getName();
        labManager30.disableEquipment("");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(equipment34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest4 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getDescription();
        java.lang.String str11 = equipment8.getDescription();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest4, equipment8);
        equipment8.setAvailable(true);
        java.lang.String str15 = equipment8.getLocation();
        java.lang.String str16 = equipment8.getId();
        equipment8.setDescription("");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.users.User user8 = null;
        com.yorku.booking.BookingFacade bookingFacade9 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user10 = null;
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade9.cancelReservation(user10, equipment14);
        com.yorku.users.Faculty faculty19 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade20 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user21 = null;
        com.yorku.equipment.Equipment equipment25 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade20.cancelReservation(user21, equipment25);
        com.yorku.equipment.Equipment equipment27 = equipment25.clone();
        com.yorku.equipment.Equipment equipment28 = equipment27.clone();
        equipment28.setLocation("");
        com.yorku.command.CancelCommand cancelCommand31 = new com.yorku.command.CancelCommand(bookingFacade9, (com.yorku.users.User) faculty19, equipment28);
        com.yorku.users.UserRegistry userRegistry32 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher36 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status37 = null;
        researcher36.setStatus(status37);
        double double39 = researcher36.getHourlyRate();
        java.lang.String str40 = researcher36.getPassword();
        userRegistry32.registerUser((com.yorku.users.User) researcher36);
        com.yorku.users.User user43 = userRegistry32.getUserByEmail("");
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str48 = equipment47.getLocation();
        equipment47.setAvailable(true);
        bookingFacade9.reserveEquipment(user43, equipment47, (int) ' ');
        equipment47.setDescription("hi!");
        bookingFacade0.reserveEquipment(user8, equipment47, (int) '4');
        equipment47.setDescription("hi!");
        com.yorku.equipment.Equipment equipment59 = equipment47.clone();
        java.lang.String str60 = equipment47.getDescription();
        org.junit.Assert.assertNotNull(equipment27);
        org.junit.Assert.assertNotNull(equipment28);
        org.junit.Assert.assertNotNull(userRegistry32);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(equipment59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        java.lang.String str8 = equipment5.getLocation();
        java.lang.String str9 = equipment5.getLocation();
        java.lang.String str10 = equipment5.getDescription();
        boolean boolean11 = equipment5.isAvailable();
        java.lang.String str12 = equipment5.getId();
        java.lang.String str13 = equipment5.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.util.List<java.lang.String> strList11 = labManager1.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade12 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user13 = null;
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade12.cancelReservation(user13, equipment17);
        com.yorku.users.Faculty faculty22 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade23 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user24 = null;
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade23.cancelReservation(user24, equipment28);
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.equipment.Equipment equipment31 = equipment30.clone();
        equipment31.setLocation("");
        com.yorku.command.CancelCommand cancelCommand34 = new com.yorku.command.CancelCommand(bookingFacade12, (com.yorku.users.User) faculty22, equipment31);
        com.yorku.users.UserRegistry userRegistry35 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher39 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status40 = null;
        researcher39.setStatus(status40);
        double double42 = researcher39.getHourlyRate();
        java.lang.String str43 = researcher39.getPassword();
        userRegistry35.registerUser((com.yorku.users.User) researcher39);
        com.yorku.users.User user46 = userRegistry35.getUserByEmail("");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        equipment50.setAvailable(true);
        bookingFacade12.reserveEquipment(user46, equipment50, (int) ' ');
        labManager1.addEquipment(equipment50);
        boolean boolean57 = equipment50.isAvailable();
        boolean boolean58 = equipment50.isAvailable();
        boolean boolean59 = equipment50.isAvailable();
        com.yorku.equipment.Equipment equipment60 = equipment50.clone();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertNotNull(userRegistry35);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(equipment60);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection5 = labManager1.getAllEquipment();
        com.yorku.equipment.Equipment equipment7 = labManager1.getEquipmentById("");
        com.yorku.booking.BookingFacade bookingFacade8 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user9 = null;
        com.yorku.equipment.Equipment equipment13 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade8.cancelReservation(user9, equipment13);
        labManager1.addEquipment(equipment13);
        java.lang.String str16 = labManager1.getEmail();
        labManager1.markForMaintenance("");
        labManager1.disableEquipment("");
        java.lang.String str21 = labManager1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipmentCollection5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "hi!", "");
        labManager1.addEquipment(equipment14);
        labManager1.enableEquipment("hi!");
        labManager1.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment21 = labManager1.getEquipmentById("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList22 = labManager1.getAvailableEquipment();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertNotNull(equipmentList22);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        labManager1.disableEquipment("");
        java.lang.String str12 = labManager1.getEmail();
        labManager1.enableEquipment("");
        labManager1.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment8 = labManager1.getEquipment("hi!");
        java.lang.String str9 = labManager1.getName();
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList14 = labManager1.getAvailableEquipment();
        java.util.List<com.yorku.equipment.Equipment> equipmentList15 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment17 = labManager1.getEquipmentById("");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNull(equipment17);
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.lang.String str6 = labManager1.getName();
        java.util.List<com.yorku.equipment.Equipment> equipmentList7 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("hi!");
        com.yorku.equipment.Equipment equipment11 = labManager1.getEquipmentById("hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(equipmentList7);
        org.junit.Assert.assertNull(equipment11);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        java.util.List<com.yorku.users.User> userList18 = headLabCoordinator0.getPendingApprovals();
        com.yorku.coordinator.LabManager labManager23 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        labManager23.markForMaintenance("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(labManager23);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator5 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher9 = new com.yorku.users.Researcher("", "", "hi!");
        double double10 = researcher9.getHourlyRate();
        headLabCoordinator5.approveUser((com.yorku.users.User) researcher9);
        userRegistry0.registerUser((com.yorku.users.User) researcher9);
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator14 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher18 = new com.yorku.users.Researcher("", "", "hi!");
        double double19 = researcher18.getHourlyRate();
        headLabCoordinator14.approveUser((com.yorku.users.User) researcher18);
        com.yorku.users.Researcher researcher24 = new com.yorku.users.Researcher("", "", "hi!");
        double double25 = researcher24.getHourlyRate();
        headLabCoordinator14.approveUser((com.yorku.users.User) researcher24);
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getId();
        com.yorku.command.CancelCommand cancelCommand32 = new com.yorku.command.CancelCommand(bookingFacade13, (com.yorku.users.User) researcher24, equipment30);
        com.yorku.users.Researcher researcher36 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status37 = null;
        researcher36.setStatus(status37);
        double double39 = researcher36.getHourlyRate();
        com.yorku.equipment.Equipment equipment43 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str44 = equipment43.getLocation();
        bookingFacade13.reserveEquipment((com.yorku.users.User) researcher36, equipment43, 0);
        java.lang.String str47 = researcher36.getEmail();
        userRegistry0.registerUser((com.yorku.users.User) researcher36);
        com.yorku.users.User.Status status49 = null;
        researcher36.setStatus(status49);
        java.lang.String str51 = researcher36.getEmail();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(headLabCoordinator5);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator14);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 20.0d + "'", double25 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor7 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor7);
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor15 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor16 = new com.yorku.observer.EquipmentMonitor();
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor16);
        sensor15.detectUsage("hi!");
        sensor15.detectUsage("");
        com.yorku.observer.Sensor sensor22 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor23 = new com.yorku.observer.EquipmentMonitor();
        sensor22.attach((com.yorku.observer.Observer) equipmentMonitor23);
        sensor22.detectUsage("hi!");
        sensor22.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor29 = new com.yorku.observer.EquipmentMonitor();
        sensor22.attach((com.yorku.observer.Observer) equipmentMonitor29);
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor29);
        com.yorku.observer.Sensor sensor32 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor33 = new com.yorku.observer.EquipmentMonitor();
        sensor32.attach((com.yorku.observer.Observer) equipmentMonitor33);
        equipmentMonitor33.update("hi!");
        equipmentMonitor33.update("");
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor33);
        equipmentMonitor33.update("");
        equipmentMonitor33.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor33);
        sensor0.detectUsage("");
        sensor0.notifyObservers("hi!");
        sensor0.notifyObservers("hi!");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("hi!");
        sensor0.notifyObservers("");
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.users.Faculty faculty29 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean30 = faculty29.isUniversityAffiliated();
        headLabCoordinator0.approveUser((com.yorku.users.User) faculty29);
        com.yorku.coordinator.LabManager labManager36 = headLabCoordinator0.generateLabManager("hi!", "hi!", "", "hi!");
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection37 = labManager36.getAllEquipment();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(labManager36);
        org.junit.Assert.assertNotNull(equipmentCollection37);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.lang.String str11 = labManager1.getPassword();
        labManager1.enableEquipment("");
        com.yorku.coordinator.LabManager labManager15 = new com.yorku.coordinator.LabManager("");
        labManager15.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList18 = labManager15.getAllEquipmentIds();
        labManager15.enableEquipment("hi!");
        java.lang.String str21 = labManager15.getName();
        labManager15.markForMaintenance("");
        labManager15.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment29 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str30 = equipment29.getLocation();
        labManager15.addEquipment(equipment29);
        java.lang.String str32 = equipment29.getLocation();
        equipment29.setAvailable(true);
        java.lang.String str35 = equipment29.getDescription();
        labManager1.addEquipment(equipment29);
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection37 = labManager1.getAllEquipment();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(equipmentCollection37);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.util.List<java.lang.String> strList11 = labManager1.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade12 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user13 = null;
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade12.cancelReservation(user13, equipment17);
        com.yorku.users.Faculty faculty22 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade23 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user24 = null;
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade23.cancelReservation(user24, equipment28);
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.equipment.Equipment equipment31 = equipment30.clone();
        equipment31.setLocation("");
        com.yorku.command.CancelCommand cancelCommand34 = new com.yorku.command.CancelCommand(bookingFacade12, (com.yorku.users.User) faculty22, equipment31);
        com.yorku.users.UserRegistry userRegistry35 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher39 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status40 = null;
        researcher39.setStatus(status40);
        double double42 = researcher39.getHourlyRate();
        java.lang.String str43 = researcher39.getPassword();
        userRegistry35.registerUser((com.yorku.users.User) researcher39);
        com.yorku.users.User user46 = userRegistry35.getUserByEmail("");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        equipment50.setAvailable(true);
        bookingFacade12.reserveEquipment(user46, equipment50, (int) ' ');
        labManager1.addEquipment(equipment50);
        java.lang.String str57 = labManager1.getPassword();
        labManager1.enableEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertNotNull(userRegistry35);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(str57);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user8 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user10 = userRegistry0.getUserByEmail("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user10);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.extend();
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getLocation();
        labManager1.addEquipment(equipment15);
        com.yorku.equipment.Equipment equipment19 = labManager1.getEquipment("hi!");
        equipment19.setLocation("hi!");
        java.lang.String str22 = equipment19.getId();
        equipment19.setAvailable(true);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        labManager1.enableEquipment("hi!");
        java.lang.String str14 = labManager1.getName();
        java.util.List<java.lang.String> strList15 = labManager1.getAllEquipmentIds();
        java.util.List<com.yorku.equipment.Equipment> equipmentList16 = labManager1.getAvailableEquipment();
        java.util.List<com.yorku.equipment.Equipment> equipmentList17 = labManager1.getAvailableEquipment();
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.equipment.Equipment equipment25 = equipment23.clone();
        com.yorku.equipment.Equipment equipment26 = equipment25.clone();
        equipment26.setLocation("");
        com.yorku.equipment.Equipment equipment29 = equipment26.clone();
        java.lang.String str30 = equipment26.getId();
        com.yorku.equipment.Equipment equipment31 = equipment26.clone();
        equipment31.setDescription("");
        java.lang.String str34 = equipment31.getDescription();
        labManager1.addEquipment(equipment31);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(equipmentList17);
        org.junit.Assert.assertNotNull(equipment25);
        org.junit.Assert.assertNotNull(equipment26);
        org.junit.Assert.assertNotNull(equipment29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.booking.BookingFacade bookingFacade7 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.users.Researcher researcher18 = new com.yorku.users.Researcher("", "", "hi!");
        double double19 = researcher18.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher18);
        com.yorku.equipment.Equipment equipment24 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str25 = equipment24.getId();
        com.yorku.command.CancelCommand cancelCommand26 = new com.yorku.command.CancelCommand(bookingFacade7, (com.yorku.users.User) researcher18, equipment24);
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        java.lang.String str32 = equipment30.getDescription();
        com.yorku.command.ExtendCommand extendCommand34 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher18, equipment30, (int) '#');
        com.yorku.users.UserRegistry userRegistry35 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean37 = userRegistry35.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade38 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest42 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str47 = equipment46.getLocation();
        java.lang.String str48 = equipment46.getDescription();
        java.lang.String str49 = equipment46.getDescription();
        bookingFacade38.cancelReservation((com.yorku.users.User) guest42, equipment46);
        userRegistry35.registerUser((com.yorku.users.User) guest42);
        com.yorku.users.User.Status status52 = null;
        guest42.setStatus(status52);
        double double54 = guest42.getHourlyRate();
        java.lang.String str55 = guest42.getIdNumber();
        java.lang.String str56 = guest42.getPassword();
        com.yorku.coordinator.LabManager labManager58 = new com.yorku.coordinator.LabManager("");
        labManager58.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList61 = labManager58.getAllEquipmentIds();
        labManager58.enableEquipment("hi!");
        java.lang.String str64 = labManager58.getName();
        labManager58.markForMaintenance("");
        labManager58.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment72 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str73 = equipment72.getLocation();
        labManager58.addEquipment(equipment72);
        java.lang.String str75 = equipment72.getLocation();
        com.yorku.equipment.Equipment equipment76 = equipment72.clone();
        bookingFacade0.extendReservation((com.yorku.users.User) guest42, equipment72, (int) ' ');
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(userRegistry35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 30.0d + "'", double54 == 30.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi!" + "'", str55, "hi!");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "hi!" + "'", str73, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(equipment76);
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.reserve();
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("");
        com.yorku.users.User.Status status5 = user4.getStatus();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNull(status5);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean24 = faculty23.isUniversityAffiliated();
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str29 = equipment28.getDescription();
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.command.ExtendCommand extendCommand32 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) faculty23, equipment28, (int) (byte) 100);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade33.cancelReservation(user34, equipment38);
        com.yorku.users.Researcher researcher43 = new com.yorku.users.Researcher("", "", "hi!");
        double double44 = researcher43.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade45 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user46 = null;
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade45.cancelReservation(user46, equipment50);
        com.yorku.equipment.Equipment equipment52 = equipment50.clone();
        com.yorku.equipment.Equipment equipment53 = equipment52.clone();
        bookingFacade33.reserveEquipment((com.yorku.users.User) researcher43, equipment52, 1);
        com.yorku.users.Faculty faculty59 = new com.yorku.users.Faculty("hi!", "", "");
        com.yorku.booking.BookingFacade bookingFacade60 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user61 = null;
        com.yorku.equipment.Equipment equipment65 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade60.cancelReservation(user61, equipment65);
        com.yorku.equipment.Equipment equipment67 = equipment65.clone();
        com.yorku.equipment.Equipment equipment68 = equipment67.clone();
        bookingFacade33.extendReservation((com.yorku.users.User) faculty59, equipment67, (int) '4');
        com.yorku.equipment.Equipment equipment74 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str75 = equipment74.getLocation();
        bookingFacade0.extendReservation((com.yorku.users.User) faculty59, equipment74, (int) (short) 10);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator78 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator79 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher83 = new com.yorku.users.Researcher("", "", "hi!");
        double double84 = researcher83.getHourlyRate();
        headLabCoordinator79.approveUser((com.yorku.users.User) researcher83);
        java.lang.String str86 = researcher83.getPassword();
        headLabCoordinator78.approveUser((com.yorku.users.User) researcher83);
        java.lang.String str88 = researcher83.getEmail();
        com.yorku.equipment.Equipment equipment92 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment92.setDescription("");
        java.lang.String str95 = equipment92.getDescription();
        com.yorku.command.ReserveCommand reserveCommand97 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher83, equipment92, (int) (short) 0);
        java.lang.String str98 = researcher83.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 20.0d + "'", double44 == 20.0d);
        org.junit.Assert.assertNotNull(equipment52);
        org.junit.Assert.assertNotNull(equipment53);
        org.junit.Assert.assertNotNull(equipment67);
        org.junit.Assert.assertNotNull(equipment68);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator78);
        org.junit.Assert.assertNotNull(headLabCoordinator79);
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 20.0d + "'", double84 == 20.0d);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str88 + "' != '" + "" + "'", str88, "");
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "" + "'", str98, "");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        com.yorku.equipment.Equipment equipment12 = labManager1.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment14 = labManager1.getEquipment("hi!");
        java.lang.String str15 = labManager1.getPassword();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection16 = labManager1.getAllEquipment();
        com.yorku.booking.BookingFacade bookingFacade17 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest21 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment25 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str26 = equipment25.getLocation();
        java.lang.String str27 = equipment25.getDescription();
        java.lang.String str28 = equipment25.getDescription();
        bookingFacade17.cancelReservation((com.yorku.users.User) guest21, equipment25);
        equipment25.setAvailable(true);
        java.lang.String str32 = equipment25.getDescription();
        com.yorku.equipment.Equipment equipment33 = equipment25.clone();
        labManager1.addEquipment(equipment33);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(equipment12);
        org.junit.Assert.assertNull(equipment14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(equipmentCollection16);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "hi!" + "'", str26, "hi!");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(equipment33);
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        com.yorku.booking.BookingFacade bookingFacade0 = null;
        com.yorku.booking.BookingFacade bookingFacade1 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user2 = null;
        com.yorku.equipment.Equipment equipment6 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade1.cancelReservation(user2, equipment6);
        com.yorku.users.Guest guest11 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double12 = guest11.getHourlyRate();
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str17 = equipment16.getId();
        com.yorku.command.ExtendCommand extendCommand19 = new com.yorku.command.ExtendCommand(bookingFacade1, (com.yorku.users.User) guest11, equipment16, (int) (short) -1);
        double double20 = guest11.getHourlyRate();
        double double21 = guest11.getHourlyRate();
        com.yorku.coordinator.LabManager labManager23 = new com.yorku.coordinator.LabManager("");
        labManager23.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList26 = labManager23.getAllEquipmentIds();
        labManager23.enableEquipment("hi!");
        java.lang.String str29 = labManager23.getName();
        labManager23.markForMaintenance("");
        labManager23.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment37 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str38 = equipment37.getLocation();
        labManager23.addEquipment(equipment37);
        com.yorku.equipment.Equipment equipment41 = labManager23.getEquipment("hi!");
        equipment41.setLocation("hi!");
        java.lang.String str44 = equipment41.getId();
        com.yorku.command.ExtendCommand extendCommand46 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) guest11, equipment41, 1);
        // The following exception was thrown during execution in test generation
        try {
            extendCommand46.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.booking.BookingFacade.extendReservation(com.yorku.users.User, com.yorku.equipment.Equipment, int)\" because \"this.booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 30.0d + "'", double12 == 30.0d);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(equipment41);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        boolean boolean8 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status13 = null;
        researcher12.setStatus(status13);
        com.yorku.users.User.Status status15 = null;
        researcher12.setStatus(status15);
        com.yorku.users.User.Status status17 = researcher12.getStatus();
        userRegistry0.registerUser((com.yorku.users.User) researcher12);
        boolean boolean20 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user22 = userRegistry0.getUserByEmail("");
        com.yorku.users.User user24 = userRegistry0.getUserByEmail("");
        boolean boolean26 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user28 = userRegistry0.getUserByEmail("hi!");
        boolean boolean30 = userRegistry0.isEmailRegistered("");
        boolean boolean32 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user34 = userRegistry0.getUserByEmail("");
        java.lang.String str35 = user34.getPassword();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(status17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(user34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        com.yorku.users.Faculty faculty3 = new com.yorku.users.Faculty("hi!", "hi!", "hi!");
        double double4 = faculty3.getHourlyRate();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Faculty faculty10 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade11.cancelReservation(user12, equipment16);
        com.yorku.equipment.Equipment equipment18 = equipment16.clone();
        com.yorku.equipment.Equipment equipment19 = equipment18.clone();
        equipment19.setLocation("");
        com.yorku.command.CancelCommand cancelCommand22 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty10, equipment19);
        com.yorku.users.Faculty faculty26 = new com.yorku.users.Faculty("hi!", "", "");
        java.lang.String str27 = faculty26.getEmail();
        boolean boolean28 = faculty26.isUniversityAffiliated();
        com.yorku.booking.BookingFacade bookingFacade29 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user30 = null;
        com.yorku.equipment.Equipment equipment34 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand36 = new com.yorku.command.ExtendCommand(bookingFacade29, user30, equipment34, 0);
        java.lang.String str37 = equipment34.getDescription();
        java.lang.String str38 = equipment34.getLocation();
        boolean boolean39 = equipment34.isAvailable();
        com.yorku.command.CancelCommand cancelCommand40 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty26, equipment34);
        java.lang.String str41 = faculty26.getEmail();
        com.yorku.users.User.Status status42 = faculty26.getStatus();
        org.junit.Assert.assertNotNull(equipment18);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertTrue("'" + status42 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status42.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        com.yorku.equipment.Equipment equipment3 = labManager1.getEquipment("hi!");
        com.yorku.booking.BookingFacade bookingFacade4 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user5 = null;
        com.yorku.equipment.Equipment equipment9 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand11 = new com.yorku.command.ExtendCommand(bookingFacade4, user5, equipment9, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator12 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher16 = new com.yorku.users.Researcher("", "", "hi!");
        double double17 = researcher16.getHourlyRate();
        headLabCoordinator12.approveUser((com.yorku.users.User) researcher16);
        com.yorku.booking.BookingFacade bookingFacade19 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user20 = null;
        com.yorku.equipment.Equipment equipment24 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade19.cancelReservation(user20, equipment24);
        com.yorku.command.ReserveCommand reserveCommand27 = new com.yorku.command.ReserveCommand(bookingFacade4, (com.yorku.users.User) researcher16, equipment24, (int) (byte) 0);
        com.yorku.users.Researcher researcher31 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status32 = null;
        researcher31.setStatus(status32);
        com.yorku.booking.BookingFacade bookingFacade34 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user35 = null;
        com.yorku.equipment.Equipment equipment39 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand41 = new com.yorku.command.ExtendCommand(bookingFacade34, user35, equipment39, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator42 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher46 = new com.yorku.users.Researcher("", "", "hi!");
        double double47 = researcher46.getHourlyRate();
        headLabCoordinator42.approveUser((com.yorku.users.User) researcher46);
        com.yorku.booking.BookingFacade bookingFacade49 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user50 = null;
        com.yorku.equipment.Equipment equipment54 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade49.cancelReservation(user50, equipment54);
        com.yorku.command.ReserveCommand reserveCommand57 = new com.yorku.command.ReserveCommand(bookingFacade34, (com.yorku.users.User) researcher46, equipment54, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand59 = new com.yorku.command.ExtendCommand(bookingFacade4, (com.yorku.users.User) researcher31, equipment54, 0);
        com.yorku.users.User user60 = null;
        com.yorku.booking.BookingFacade bookingFacade61 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator62 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher66 = new com.yorku.users.Researcher("", "", "hi!");
        double double67 = researcher66.getHourlyRate();
        headLabCoordinator62.approveUser((com.yorku.users.User) researcher66);
        com.yorku.users.Researcher researcher72 = new com.yorku.users.Researcher("", "", "hi!");
        double double73 = researcher72.getHourlyRate();
        headLabCoordinator62.approveUser((com.yorku.users.User) researcher72);
        com.yorku.equipment.Equipment equipment78 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str79 = equipment78.getId();
        com.yorku.command.CancelCommand cancelCommand80 = new com.yorku.command.CancelCommand(bookingFacade61, (com.yorku.users.User) researcher72, equipment78);
        java.lang.String str81 = equipment78.getId();
        com.yorku.command.CancelCommand cancelCommand82 = new com.yorku.command.CancelCommand(bookingFacade4, user60, equipment78);
        equipment78.setAvailable(false);
        labManager1.addEquipment(equipment78);
        java.util.List<java.lang.String> strList86 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList89 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment91 = labManager1.getEquipment("hi!");
        org.junit.Assert.assertNull(equipment3);
        org.junit.Assert.assertNotNull(headLabCoordinator12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator42);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 20.0d + "'", double47 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator62);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 20.0d + "'", double67 == 20.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 20.0d + "'", double73 == 20.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertNotNull(strList86);
        org.junit.Assert.assertNotNull(equipmentList89);
        org.junit.Assert.assertNotNull(equipment91);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand33 = new com.yorku.command.ExtendCommand(bookingFacade26, user27, equipment31, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        com.yorku.booking.BookingFacade bookingFacade41 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user42 = null;
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade41.cancelReservation(user42, equipment46);
        com.yorku.command.ReserveCommand reserveCommand49 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher38, equipment46, (int) (byte) 0);
        com.yorku.users.Researcher researcher53 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status54 = null;
        researcher53.setStatus(status54);
        com.yorku.booking.BookingFacade bookingFacade56 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user57 = null;
        com.yorku.equipment.Equipment equipment61 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand63 = new com.yorku.command.ExtendCommand(bookingFacade56, user57, equipment61, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator64 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher68);
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.command.ReserveCommand reserveCommand79 = new com.yorku.command.ReserveCommand(bookingFacade56, (com.yorku.users.User) researcher68, equipment76, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand81 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) researcher53, equipment76, 0);
        com.yorku.users.User.Status status82 = researcher53.getStatus();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher53);
        com.yorku.coordinator.LabManager labManager88 = headLabCoordinator0.generateLabManager("hi!", "hi!", "hi!", "hi!");
        com.yorku.coordinator.LabManager labManager93 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        java.util.List<com.yorku.equipment.Equipment> equipmentList94 = labManager93.getAvailableEquipment();
        java.lang.String str95 = labManager93.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertNull(status82);
        org.junit.Assert.assertNotNull(labManager88);
        org.junit.Assert.assertNotNull(labManager93);
        org.junit.Assert.assertNotNull(equipmentList94);
        org.junit.Assert.assertNull(str95);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        java.lang.String str8 = equipment5.getDescription();
        java.lang.String str9 = equipment5.getLocation();
        boolean boolean10 = equipment5.isAvailable();
        equipment5.setLocation("hi!");
        equipment5.setAvailable(true);
        java.lang.String str15 = equipment5.getId();
        java.lang.String str16 = equipment5.getLocation();
        com.yorku.equipment.Equipment equipment17 = equipment5.clone();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(equipment17);
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("");
        boolean boolean4 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.UserRegistry userRegistry7 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user9 = userRegistry7.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade10 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user11 = null;
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand17 = new com.yorku.command.ExtendCommand(bookingFacade10, user11, equipment15, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade25 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user26 = null;
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade25.cancelReservation(user26, equipment30);
        com.yorku.command.ReserveCommand reserveCommand33 = new com.yorku.command.ReserveCommand(bookingFacade10, (com.yorku.users.User) researcher22, equipment30, (int) (byte) 0);
        com.yorku.users.Researcher researcher37 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status38 = null;
        researcher37.setStatus(status38);
        com.yorku.booking.BookingFacade bookingFacade40 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user41 = null;
        com.yorku.equipment.Equipment equipment45 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand47 = new com.yorku.command.ExtendCommand(bookingFacade40, user41, equipment45, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator48 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher52 = new com.yorku.users.Researcher("", "", "hi!");
        double double53 = researcher52.getHourlyRate();
        headLabCoordinator48.approveUser((com.yorku.users.User) researcher52);
        com.yorku.booking.BookingFacade bookingFacade55 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user56 = null;
        com.yorku.equipment.Equipment equipment60 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade55.cancelReservation(user56, equipment60);
        com.yorku.command.ReserveCommand reserveCommand63 = new com.yorku.command.ReserveCommand(bookingFacade40, (com.yorku.users.User) researcher52, equipment60, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand65 = new com.yorku.command.ExtendCommand(bookingFacade10, (com.yorku.users.User) researcher37, equipment60, 0);
        userRegistry7.registerUser((com.yorku.users.User) researcher37);
        com.yorku.users.User user68 = userRegistry7.getUserByEmail("");
        com.yorku.users.Guest guest72 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double73 = guest72.getHourlyRate();
        double double74 = guest72.getHourlyRate();
        userRegistry7.registerUser((com.yorku.users.User) guest72);
        userRegistry0.registerUser((com.yorku.users.User) guest72);
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(userRegistry7);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator48);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 20.0d + "'", double53 == 20.0d);
        org.junit.Assert.assertNotNull(user68);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 30.0d + "'", double73 == 30.0d);
        org.junit.Assert.assertTrue("'" + double74 + "' != '" + 30.0d + "'", double74 == 30.0d);
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        java.lang.String str8 = researcher5.getPassword();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher5);
        com.yorku.coordinator.LabManager labManager14 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        java.util.List<java.lang.String> strList15 = labManager14.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection16 = labManager14.getAllEquipment();
        labManager14.markForMaintenance("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(equipmentCollection16);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.extend();
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList6 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        java.lang.String str7 = labManager1.getPassword();
        labManager1.enableEquipment("hi!");
        labManager1.disableEquipment("hi!");
        java.lang.String str12 = labManager1.getEmail();
        labManager1.markForMaintenance("");
        java.lang.String str15 = labManager1.getEmail();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.equipment.Equipment equipment7 = equipment5.clone();
        com.yorku.equipment.Equipment equipment8 = equipment7.clone();
        equipment8.setLocation("");
        com.yorku.equipment.Equipment equipment11 = equipment8.clone();
        java.lang.String str12 = equipment8.getId();
        com.yorku.equipment.Equipment equipment13 = equipment8.clone();
        equipment13.setLocation("hi!");
        equipment13.setLocation("");
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertNotNull(equipment8);
        org.junit.Assert.assertNotNull(equipment11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(equipment13);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        java.lang.String str11 = labManager1.getPassword();
        java.util.List<com.yorku.equipment.Equipment> equipmentList12 = labManager1.getAvailableEquipment();
        labManager1.enableEquipment("hi!");
        java.util.List<java.lang.String> strList15 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(equipmentList12);
        org.junit.Assert.assertNotNull(strList15);
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.lang.String str11 = labManager1.getPassword();
        java.util.List<com.yorku.equipment.Equipment> equipmentList12 = labManager1.getAvailableEquipment();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(equipmentList12);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        java.lang.String str8 = researcher5.getPassword();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher5);
        com.yorku.coordinator.LabManager labManager14 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        java.util.List<java.lang.String> strList15 = labManager14.getAllEquipmentIds();
        com.yorku.equipment.Equipment equipment17 = labManager14.getEquipment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNull(equipment17);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.cancel();
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        sensor0.notifyObservers("hi!");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        java.util.List<com.yorku.users.User> userList1 = headLabCoordinator0.getPendingApprovals();
        com.yorku.booking.BookingFacade bookingFacade2 = new com.yorku.booking.BookingFacade();
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        com.yorku.booking.BookingFacade bookingFacade59 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user60 = null;
        com.yorku.equipment.Equipment equipment64 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade59.cancelReservation(user60, equipment64);
        com.yorku.equipment.Equipment equipment66 = equipment64.clone();
        bookingFacade2.cancelReservation((com.yorku.users.User) researcher30, equipment64);
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher30);
        com.yorku.coordinator.LabManager labManager73 = headLabCoordinator0.generateLabManager("", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(equipment66);
        org.junit.Assert.assertNotNull(labManager73);
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        com.yorku.observer.Sensor sensor7 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor8 = new com.yorku.observer.EquipmentMonitor();
        sensor7.attach((com.yorku.observer.Observer) equipmentMonitor8);
        sensor7.detectUsage("hi!");
        sensor7.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor14 = new com.yorku.observer.EquipmentMonitor();
        sensor7.attach((com.yorku.observer.Observer) equipmentMonitor14);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor14);
        sensor0.notifyObservers("");
        sensor0.notifyObservers("");
        com.yorku.observer.Sensor sensor21 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor22 = new com.yorku.observer.EquipmentMonitor();
        sensor21.attach((com.yorku.observer.Observer) equipmentMonitor22);
        com.yorku.observer.EquipmentMonitor equipmentMonitor24 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor24.update("");
        sensor21.attach((com.yorku.observer.Observer) equipmentMonitor24);
        com.yorku.observer.Sensor sensor28 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor29 = new com.yorku.observer.EquipmentMonitor();
        sensor28.attach((com.yorku.observer.Observer) equipmentMonitor29);
        sensor28.detectUsage("hi!");
        sensor28.detectUsage("");
        com.yorku.observer.Sensor sensor35 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor36 = new com.yorku.observer.EquipmentMonitor();
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor36);
        sensor35.detectUsage("hi!");
        sensor35.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor42 = new com.yorku.observer.EquipmentMonitor();
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor42);
        sensor28.attach((com.yorku.observer.Observer) equipmentMonitor42);
        com.yorku.observer.Sensor sensor45 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor46 = new com.yorku.observer.EquipmentMonitor();
        sensor45.attach((com.yorku.observer.Observer) equipmentMonitor46);
        equipmentMonitor46.update("hi!");
        equipmentMonitor46.update("");
        sensor28.attach((com.yorku.observer.Observer) equipmentMonitor46);
        sensor28.notifyObservers("");
        com.yorku.observer.Sensor sensor55 = new com.yorku.observer.Sensor();
        com.yorku.observer.Sensor sensor56 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor57 = new com.yorku.observer.EquipmentMonitor();
        sensor56.attach((com.yorku.observer.Observer) equipmentMonitor57);
        sensor56.detectUsage("hi!");
        sensor56.detectUsage("");
        com.yorku.observer.Sensor sensor63 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor64 = new com.yorku.observer.EquipmentMonitor();
        sensor63.attach((com.yorku.observer.Observer) equipmentMonitor64);
        sensor63.detectUsage("hi!");
        sensor63.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor70 = new com.yorku.observer.EquipmentMonitor();
        sensor63.attach((com.yorku.observer.Observer) equipmentMonitor70);
        sensor56.attach((com.yorku.observer.Observer) equipmentMonitor70);
        com.yorku.observer.Sensor sensor73 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor74 = new com.yorku.observer.EquipmentMonitor();
        sensor73.attach((com.yorku.observer.Observer) equipmentMonitor74);
        equipmentMonitor74.update("hi!");
        equipmentMonitor74.update("");
        sensor56.attach((com.yorku.observer.Observer) equipmentMonitor74);
        equipmentMonitor74.update("");
        sensor55.attach((com.yorku.observer.Observer) equipmentMonitor74);
        equipmentMonitor74.update("hi!");
        sensor28.attach((com.yorku.observer.Observer) equipmentMonitor74);
        sensor21.attach((com.yorku.observer.Observer) equipmentMonitor74);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor74);
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.users.Researcher researcher29 = new com.yorku.users.Researcher("hi!", "hi!", "hi!");
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher29);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator31 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher35 = new com.yorku.users.Researcher("", "", "hi!");
        double double36 = researcher35.getHourlyRate();
        headLabCoordinator31.approveUser((com.yorku.users.User) researcher35);
        com.yorku.users.Researcher researcher41 = new com.yorku.users.Researcher("", "", "hi!");
        double double42 = researcher41.getHourlyRate();
        headLabCoordinator31.approveUser((com.yorku.users.User) researcher41);
        com.yorku.users.Faculty faculty47 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator31.rejectUser((com.yorku.users.User) faculty47);
        java.lang.String str49 = faculty47.getIdNumber();
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty47);
        com.yorku.coordinator.LabManager labManager55 = headLabCoordinator0.generateLabManager("hi!", "hi!", "", "hi!");
        com.yorku.users.UserRegistry userRegistry56 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean58 = userRegistry56.isEmailRegistered("");
        com.yorku.users.User user60 = userRegistry56.getUserByEmail("hi!");
        boolean boolean62 = userRegistry56.isEmailRegistered("");
        boolean boolean64 = userRegistry56.isEmailRegistered("");
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status69 = null;
        researcher68.setStatus(status69);
        com.yorku.users.User.Status status71 = null;
        researcher68.setStatus(status71);
        com.yorku.users.User.Status status73 = researcher68.getStatus();
        userRegistry56.registerUser((com.yorku.users.User) researcher68);
        boolean boolean76 = userRegistry56.isEmailRegistered("hi!");
        com.yorku.users.User user78 = userRegistry56.getUserByEmail("");
        com.yorku.users.User user80 = userRegistry56.getUserByEmail("");
        headLabCoordinator0.rejectUser(user80);
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNotNull(labManager55);
        org.junit.Assert.assertNotNull(userRegistry56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNull(status73);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNotNull(user78);
        org.junit.Assert.assertNotNull(user80);
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.util.List<java.lang.String> strList11 = labManager1.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade12 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user13 = null;
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade12.cancelReservation(user13, equipment17);
        com.yorku.users.Faculty faculty22 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade23 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user24 = null;
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade23.cancelReservation(user24, equipment28);
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.equipment.Equipment equipment31 = equipment30.clone();
        equipment31.setLocation("");
        com.yorku.command.CancelCommand cancelCommand34 = new com.yorku.command.CancelCommand(bookingFacade12, (com.yorku.users.User) faculty22, equipment31);
        com.yorku.users.UserRegistry userRegistry35 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher39 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status40 = null;
        researcher39.setStatus(status40);
        double double42 = researcher39.getHourlyRate();
        java.lang.String str43 = researcher39.getPassword();
        userRegistry35.registerUser((com.yorku.users.User) researcher39);
        com.yorku.users.User user46 = userRegistry35.getUserByEmail("");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        equipment50.setAvailable(true);
        bookingFacade12.reserveEquipment(user46, equipment50, (int) ' ');
        labManager1.addEquipment(equipment50);
        boolean boolean57 = equipment50.isAvailable();
        boolean boolean58 = equipment50.isAvailable();
        java.lang.String str59 = equipment50.getLocation();
        java.lang.String str60 = equipment50.getLocation();
        equipment50.setLocation("hi!");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertNotNull(userRegistry35);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(user46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        com.yorku.users.Researcher researcher27 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status28 = null;
        researcher27.setStatus(status28);
        double double30 = researcher27.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade31 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user32 = null;
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade31.cancelReservation(user32, equipment36);
        java.lang.String str38 = equipment36.getLocation();
        boolean boolean39 = equipment36.isAvailable();
        com.yorku.command.ExtendCommand extendCommand41 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher27, equipment36, (int) (byte) 100);
        com.yorku.users.Student student45 = new com.yorku.users.Student("", "hi!", "hi!");
        java.lang.String str46 = student45.getPassword();
        com.yorku.users.UserRegistry userRegistry47 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean49 = userRegistry47.isEmailRegistered("");
        com.yorku.users.User user51 = userRegistry47.getUserByEmail("hi!");
        com.yorku.users.Faculty faculty55 = new com.yorku.users.Faculty("hi!", "", "hi!");
        userRegistry47.registerUser((com.yorku.users.User) faculty55);
        double double57 = faculty55.getHourlyRate();
        com.yorku.users.User.Status status58 = faculty55.getStatus();
        student45.setStatus(status58);
        com.yorku.booking.BookingFacade bookingFacade60 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator61 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher65 = new com.yorku.users.Researcher("", "", "hi!");
        double double66 = researcher65.getHourlyRate();
        headLabCoordinator61.approveUser((com.yorku.users.User) researcher65);
        com.yorku.users.Researcher researcher71 = new com.yorku.users.Researcher("", "", "hi!");
        double double72 = researcher71.getHourlyRate();
        headLabCoordinator61.approveUser((com.yorku.users.User) researcher71);
        com.yorku.equipment.Equipment equipment77 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str78 = equipment77.getId();
        com.yorku.command.CancelCommand cancelCommand79 = new com.yorku.command.CancelCommand(bookingFacade60, (com.yorku.users.User) researcher71, equipment77);
        java.lang.String str80 = equipment77.getId();
        equipment77.setDescription("");
        java.lang.String str83 = equipment77.getDescription();
        equipment77.setDescription("hi!");
        bookingFacade0.extendReservation((com.yorku.users.User) student45, equipment77, (int) (short) 100);
        com.yorku.users.User.Status status88 = student45.getStatus();
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNotNull(userRegistry47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(user51);
        org.junit.Assert.assertTrue("'" + double57 + "' != '" + 15.0d + "'", double57 == 15.0d);
        org.junit.Assert.assertTrue("'" + status58 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status58.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertNotNull(headLabCoordinator61);
        org.junit.Assert.assertTrue("'" + double66 + "' != '" + 20.0d + "'", double66 == 20.0d);
        org.junit.Assert.assertTrue("'" + double72 + "' != '" + 20.0d + "'", double72 == 20.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "hi!" + "'", str80, "hi!");
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertTrue("'" + status88 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status88.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection5 = labManager1.getAllEquipment();
        java.lang.String str6 = labManager1.getPassword();
        com.yorku.equipment.Equipment equipment8 = labManager1.getEquipment("");
        com.yorku.equipment.Equipment equipment10 = labManager1.getEquipment("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipmentCollection5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(equipment10);
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        com.yorku.users.Researcher researcher27 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status28 = null;
        researcher27.setStatus(status28);
        double double30 = researcher27.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade31 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user32 = null;
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade31.cancelReservation(user32, equipment36);
        java.lang.String str38 = equipment36.getLocation();
        boolean boolean39 = equipment36.isAvailable();
        com.yorku.command.ExtendCommand extendCommand41 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher27, equipment36, (int) (byte) 100);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator42 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher46 = new com.yorku.users.Researcher("", "", "hi!");
        double double47 = researcher46.getHourlyRate();
        headLabCoordinator42.approveUser((com.yorku.users.User) researcher46);
        com.yorku.booking.BookingFacade bookingFacade49 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user50 = null;
        com.yorku.equipment.Equipment equipment54 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand56 = new com.yorku.command.ExtendCommand(bookingFacade49, user50, equipment54, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator57 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher61 = new com.yorku.users.Researcher("", "", "hi!");
        double double62 = researcher61.getHourlyRate();
        headLabCoordinator57.approveUser((com.yorku.users.User) researcher61);
        com.yorku.booking.BookingFacade bookingFacade64 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user65 = null;
        com.yorku.equipment.Equipment equipment69 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade64.cancelReservation(user65, equipment69);
        com.yorku.command.ReserveCommand reserveCommand72 = new com.yorku.command.ReserveCommand(bookingFacade49, (com.yorku.users.User) researcher61, equipment69, (int) (byte) 0);
        com.yorku.users.Researcher researcher76 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status77 = null;
        researcher76.setStatus(status77);
        double double79 = researcher76.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade80 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user81 = null;
        com.yorku.equipment.Equipment equipment85 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade80.cancelReservation(user81, equipment85);
        java.lang.String str87 = equipment85.getLocation();
        boolean boolean88 = equipment85.isAvailable();
        com.yorku.command.ExtendCommand extendCommand90 = new com.yorku.command.ExtendCommand(bookingFacade49, (com.yorku.users.User) researcher76, equipment85, (int) (byte) 100);
        com.yorku.command.ExtendCommand extendCommand92 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher46, equipment85, (int) (byte) 0);
        equipment85.setAvailable(false);
        java.lang.String str95 = equipment85.getDescription();
        equipment85.setLocation("");
        equipment85.setLocation("");
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator42);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 20.0d + "'", double47 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator57);
        org.junit.Assert.assertTrue("'" + double62 + "' != '" + 20.0d + "'", double62 == 20.0d);
        org.junit.Assert.assertTrue("'" + double79 + "' != '" + 20.0d + "'", double79 == 20.0d);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + true + "'", boolean88 == true);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "" + "'", str95, "");
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status5 = null;
        researcher4.setStatus(status5);
        double double7 = researcher4.getHourlyRate();
        java.lang.String str8 = researcher4.getPassword();
        userRegistry0.registerUser((com.yorku.users.User) researcher4);
        com.yorku.users.User user11 = userRegistry0.getUserByEmail("");
        boolean boolean13 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean15 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user17 = userRegistry0.getUserByEmail("");
        boolean boolean19 = userRegistry0.isEmailRegistered("hi!");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.coordinator.LabManager labManager11 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        labManager11.enableEquipment("hi!");
        labManager11.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment17 = labManager11.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment19 = labManager11.getEquipmentById("hi!");
        labManager11.disableEquipment("hi!");
        com.yorku.equipment.Equipment equipment23 = labManager11.getEquipment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNull(equipment17);
        org.junit.Assert.assertNull(equipment19);
        org.junit.Assert.assertNull(equipment23);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("hi!");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand33 = new com.yorku.command.ExtendCommand(bookingFacade26, user27, equipment31, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        com.yorku.booking.BookingFacade bookingFacade41 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user42 = null;
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade41.cancelReservation(user42, equipment46);
        com.yorku.command.ReserveCommand reserveCommand49 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher38, equipment46, (int) (byte) 0);
        com.yorku.users.Researcher researcher53 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status54 = null;
        researcher53.setStatus(status54);
        com.yorku.booking.BookingFacade bookingFacade56 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user57 = null;
        com.yorku.equipment.Equipment equipment61 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand63 = new com.yorku.command.ExtendCommand(bookingFacade56, user57, equipment61, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator64 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher68);
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.command.ReserveCommand reserveCommand79 = new com.yorku.command.ReserveCommand(bookingFacade56, (com.yorku.users.User) researcher68, equipment76, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand81 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) researcher53, equipment76, 0);
        com.yorku.users.User.Status status82 = researcher53.getStatus();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher53);
        com.yorku.coordinator.LabManager labManager88 = headLabCoordinator0.generateLabManager("hi!", "hi!", "hi!", "hi!");
        com.yorku.coordinator.LabManager labManager93 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection94 = labManager93.getAllEquipment();
        java.util.List<java.lang.String> strList95 = labManager93.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertNull(status82);
        org.junit.Assert.assertNotNull(labManager88);
        org.junit.Assert.assertNotNull(labManager93);
        org.junit.Assert.assertNotNull(equipmentCollection94);
        org.junit.Assert.assertNotNull(strList95);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher6 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status7 = null;
        researcher6.setStatus(status7);
        double double9 = researcher6.getHourlyRate();
        java.lang.String str10 = researcher6.getPassword();
        userRegistry0.registerUser((com.yorku.users.User) researcher6);
        boolean boolean13 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean15 = userRegistry0.isEmailRegistered("");
        boolean boolean17 = userRegistry0.isEmailRegistered("");
        boolean boolean19 = userRegistry0.isEmailRegistered("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor11 = new com.yorku.observer.Sensor();
        sensor11.notifyObservers("");
        sensor11.notifyObservers("");
        sensor11.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor18 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor19 = new com.yorku.observer.EquipmentMonitor();
        sensor18.attach((com.yorku.observer.Observer) equipmentMonitor19);
        sensor18.detectUsage("hi!");
        sensor18.detectUsage("");
        com.yorku.observer.Sensor sensor25 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor26 = new com.yorku.observer.EquipmentMonitor();
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor26);
        sensor25.detectUsage("hi!");
        sensor25.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor32 = new com.yorku.observer.EquipmentMonitor();
        sensor25.attach((com.yorku.observer.Observer) equipmentMonitor32);
        sensor18.attach((com.yorku.observer.Observer) equipmentMonitor32);
        com.yorku.observer.Sensor sensor35 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor36 = new com.yorku.observer.EquipmentMonitor();
        sensor35.attach((com.yorku.observer.Observer) equipmentMonitor36);
        equipmentMonitor36.update("hi!");
        equipmentMonitor36.update("");
        sensor18.attach((com.yorku.observer.Observer) equipmentMonitor36);
        equipmentMonitor36.update("");
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor36);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor36);
        sensor0.notifyObservers("");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest4 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getDescription();
        java.lang.String str11 = equipment8.getDescription();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest4, equipment8);
        com.yorku.users.Researcher researcher16 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status17 = null;
        researcher16.setStatus(status17);
        boolean boolean19 = researcher16.isUniversityAffiliated();
        java.lang.String str20 = researcher16.getIdNumber();
        com.yorku.coordinator.LabManager labManager22 = new com.yorku.coordinator.LabManager("");
        labManager22.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList25 = labManager22.getAllEquipmentIds();
        labManager22.enableEquipment("hi!");
        java.lang.String str28 = labManager22.getName();
        labManager22.markForMaintenance("");
        labManager22.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str37 = equipment36.getLocation();
        labManager22.addEquipment(equipment36);
        com.yorku.equipment.Equipment equipment40 = labManager22.getEquipment("hi!");
        boolean boolean41 = equipment40.isAvailable();
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher16, equipment40);
        java.lang.String str43 = researcher16.getEmail();
        double double44 = researcher16.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertNotNull(equipment40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 20.0d + "'", double44 == 20.0d);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        java.lang.String str8 = equipment5.getLocation();
        java.lang.String str9 = equipment5.getLocation();
        boolean boolean10 = equipment5.isAvailable();
        equipment5.setAvailable(true);
        boolean boolean13 = equipment5.isAvailable();
        java.lang.String str14 = equipment5.getLocation();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Guest guest10 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double11 = guest10.getHourlyRate();
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getId();
        com.yorku.command.ExtendCommand extendCommand18 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) guest10, equipment15, (int) (short) -1);
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status23 = null;
        researcher22.setStatus(status23);
        com.yorku.booking.BookingFacade bookingFacade25 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user26 = null;
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade25.cancelReservation(user26, equipment30);
        java.lang.String str32 = equipment30.getLocation();
        equipment30.setAvailable(false);
        com.yorku.command.CancelCommand cancelCommand35 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher22, equipment30);
        equipment30.setDescription("");
        java.lang.String str38 = equipment30.getId();
        java.lang.String str39 = equipment30.getLocation();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.reserve();
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest4 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getDescription();
        java.lang.String str11 = equipment8.getDescription();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest4, equipment8);
        double double13 = guest4.getHourlyRate();
        java.lang.String str14 = guest4.getIdNumber();
        double double15 = guest4.getHourlyRate();
        java.lang.String str16 = guest4.getPassword();
        com.yorku.users.Researcher researcher20 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status21 = null;
        researcher20.setStatus(status21);
        boolean boolean23 = researcher20.isUniversityAffiliated();
        boolean boolean24 = researcher20.isUniversityAffiliated();
        com.yorku.users.UserRegistry userRegistry25 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean27 = userRegistry25.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade28 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest32 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str37 = equipment36.getLocation();
        java.lang.String str38 = equipment36.getDescription();
        java.lang.String str39 = equipment36.getDescription();
        bookingFacade28.cancelReservation((com.yorku.users.User) guest32, equipment36);
        userRegistry25.registerUser((com.yorku.users.User) guest32);
        com.yorku.users.User.Status status42 = guest32.getStatus();
        com.yorku.users.User.Status status43 = guest32.getStatus();
        researcher20.setStatus(status43);
        guest4.setStatus(status43);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 30.0d + "'", double13 == 30.0d);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 30.0d + "'", double15 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(userRegistry25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertTrue("'" + status42 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status42.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + status43 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status43.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.booking.BookingFacade bookingFacade1 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user2 = null;
        com.yorku.equipment.Equipment equipment6 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade1.cancelReservation(user2, equipment6);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user14 = null;
        com.yorku.equipment.Equipment equipment18 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade13.cancelReservation(user14, equipment18);
        com.yorku.equipment.Equipment equipment20 = equipment18.clone();
        com.yorku.equipment.Equipment equipment21 = equipment20.clone();
        bookingFacade1.reserveEquipment((com.yorku.users.User) researcher11, equipment20, 1);
        java.lang.String str24 = researcher11.getIdNumber();
        com.yorku.users.User.Status status25 = researcher11.getStatus();
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator27 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher31 = new com.yorku.users.Researcher("", "", "hi!");
        double double32 = researcher31.getHourlyRate();
        headLabCoordinator27.approveUser((com.yorku.users.User) researcher31);
        com.yorku.users.Researcher researcher37 = new com.yorku.users.Researcher("", "", "hi!");
        double double38 = researcher37.getHourlyRate();
        headLabCoordinator27.approveUser((com.yorku.users.User) researcher37);
        com.yorku.equipment.Equipment equipment43 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str44 = equipment43.getId();
        com.yorku.command.CancelCommand cancelCommand45 = new com.yorku.command.CancelCommand(bookingFacade26, (com.yorku.users.User) researcher37, equipment43);
        com.yorku.users.Faculty faculty49 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean50 = faculty49.isUniversityAffiliated();
        com.yorku.equipment.Equipment equipment54 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str55 = equipment54.getDescription();
        com.yorku.equipment.Equipment equipment56 = equipment54.clone();
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) faculty49, equipment54, (int) (byte) 100);
        com.yorku.users.Guest guest62 = new com.yorku.users.Guest("hi!", "", "hi!");
        double double63 = guest62.getHourlyRate();
        com.yorku.equipment.Equipment equipment67 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str68 = equipment67.getLocation();
        java.lang.String str69 = equipment67.getDescription();
        com.yorku.equipment.Equipment equipment70 = equipment67.clone();
        equipment67.setDescription("hi!");
        com.yorku.command.ReserveCommand reserveCommand74 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) guest62, equipment67, 0);
        equipment67.setAvailable(true);
        com.yorku.equipment.Equipment equipment77 = equipment67.clone();
        com.yorku.command.ExtendCommand extendCommand79 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment67, (int) '#');
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(equipment20);
        org.junit.Assert.assertNotNull(equipment21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + status25 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status25.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertNotNull(headLabCoordinator27);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 20.0d + "'", double32 == 20.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 20.0d + "'", double38 == 20.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "hi!" + "'", str44, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(equipment56);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 30.0d + "'", double63 == 30.0d);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "hi!" + "'", str68, "hi!");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(equipment70);
        org.junit.Assert.assertNotNull(equipment77);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status5 = null;
        researcher4.setStatus(status5);
        double double7 = researcher4.getHourlyRate();
        java.lang.String str8 = researcher4.getPassword();
        userRegistry0.registerUser((com.yorku.users.User) researcher4);
        com.yorku.users.User user11 = userRegistry0.getUserByEmail("");
        boolean boolean13 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean15 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user17 = userRegistry0.getUserByEmail("");
        com.yorku.users.UserRegistry userRegistry18 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean20 = userRegistry18.isEmailRegistered("hi!");
        com.yorku.users.Researcher researcher24 = new com.yorku.users.Researcher("", "", "");
        userRegistry18.registerUser((com.yorku.users.User) researcher24);
        com.yorku.users.User user27 = userRegistry18.getUserByEmail("hi!");
        com.yorku.users.User user29 = userRegistry18.getUserByEmail("hi!");
        userRegistry0.registerUser(user29);
        java.lang.String str31 = user29.getEmail();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 20.0d + "'", double7 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(userRegistry18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(user27);
        org.junit.Assert.assertNotNull(user29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.cancel();
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        java.util.List<com.yorku.users.User> userList18 = headLabCoordinator0.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList19 = headLabCoordinator0.getPendingApprovals();
        com.yorku.booking.BookingFacade bookingFacade20 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user21 = null;
        com.yorku.equipment.Equipment equipment25 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade20.cancelReservation(user21, equipment25);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        double double31 = researcher30.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade32 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user33 = null;
        com.yorku.equipment.Equipment equipment37 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade32.cancelReservation(user33, equipment37);
        com.yorku.equipment.Equipment equipment39 = equipment37.clone();
        com.yorku.equipment.Equipment equipment40 = equipment39.clone();
        bookingFacade20.reserveEquipment((com.yorku.users.User) researcher30, equipment39, 1);
        com.yorku.users.Faculty faculty46 = new com.yorku.users.Faculty("hi!", "", "");
        com.yorku.booking.BookingFacade bookingFacade47 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user48 = null;
        com.yorku.equipment.Equipment equipment52 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade47.cancelReservation(user48, equipment52);
        com.yorku.equipment.Equipment equipment54 = equipment52.clone();
        com.yorku.equipment.Equipment equipment55 = equipment54.clone();
        bookingFacade20.extendReservation((com.yorku.users.User) faculty46, equipment54, (int) '4');
        com.yorku.users.Guest guest61 = new com.yorku.users.Guest("hi!", "", "");
        java.lang.String str62 = guest61.getIdNumber();
        com.yorku.coordinator.LabManager labManager64 = new com.yorku.coordinator.LabManager("");
        labManager64.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList67 = labManager64.getAllEquipmentIds();
        labManager64.enableEquipment("hi!");
        java.lang.String str70 = labManager64.getName();
        labManager64.markForMaintenance("");
        java.util.List<java.lang.String> strList73 = labManager64.getAllEquipmentIds();
        java.lang.String str74 = labManager64.getName();
        com.yorku.booking.BookingFacade bookingFacade75 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest79 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment83 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str84 = equipment83.getLocation();
        java.lang.String str85 = equipment83.getDescription();
        java.lang.String str86 = equipment83.getDescription();
        bookingFacade75.cancelReservation((com.yorku.users.User) guest79, equipment83);
        equipment83.setAvailable(true);
        labManager64.addEquipment(equipment83);
        com.yorku.command.ExtendCommand extendCommand92 = new com.yorku.command.ExtendCommand(bookingFacade20, (com.yorku.users.User) guest61, equipment83, (int) (byte) 100);
        headLabCoordinator0.approveUser((com.yorku.users.User) guest61);
        java.lang.String str94 = guest61.getIdNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 20.0d + "'", double31 == 20.0d);
        org.junit.Assert.assertNotNull(equipment39);
        org.junit.Assert.assertNotNull(equipment40);
        org.junit.Assert.assertNotNull(equipment54);
        org.junit.Assert.assertNotNull(equipment55);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "hi!" + "'", str84, "hi!");
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "" + "'", str85, "");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Faculty faculty10 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade11.cancelReservation(user12, equipment16);
        com.yorku.equipment.Equipment equipment18 = equipment16.clone();
        com.yorku.equipment.Equipment equipment19 = equipment18.clone();
        equipment19.setLocation("");
        com.yorku.command.CancelCommand cancelCommand22 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty10, equipment19);
        com.yorku.users.Faculty faculty26 = new com.yorku.users.Faculty("hi!", "", "");
        java.lang.String str27 = faculty26.getEmail();
        boolean boolean28 = faculty26.isUniversityAffiliated();
        com.yorku.booking.BookingFacade bookingFacade29 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user30 = null;
        com.yorku.equipment.Equipment equipment34 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand36 = new com.yorku.command.ExtendCommand(bookingFacade29, user30, equipment34, 0);
        java.lang.String str37 = equipment34.getDescription();
        java.lang.String str38 = equipment34.getLocation();
        boolean boolean39 = equipment34.isAvailable();
        com.yorku.command.CancelCommand cancelCommand40 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty26, equipment34);
        java.lang.String str41 = equipment34.getId();
        org.junit.Assert.assertNotNull(equipment18);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        userRegistry0.registerUser((com.yorku.users.User) researcher30);
        boolean boolean61 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean63 = userRegistry0.isEmailRegistered("");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator64 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher68);
        com.yorku.users.Researcher researcher74 = new com.yorku.users.Researcher("", "", "hi!");
        double double75 = researcher74.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher74);
        com.yorku.users.Faculty faculty80 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator64.rejectUser((com.yorku.users.User) faculty80);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator82 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher86 = new com.yorku.users.Researcher("", "", "hi!");
        double double87 = researcher86.getHourlyRate();
        headLabCoordinator82.approveUser((com.yorku.users.User) researcher86);
        headLabCoordinator64.rejectUser((com.yorku.users.User) researcher86);
        com.yorku.users.Researcher researcher93 = new com.yorku.users.Researcher("hi!", "hi!", "hi!");
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher93);
        userRegistry0.registerUser((com.yorku.users.User) researcher93);
        java.lang.String str96 = researcher93.getEmail();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 20.0d + "'", double75 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator82);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 20.0d + "'", double87 == 20.0d);
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "hi!" + "'", str96, "hi!");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        java.util.List<com.yorku.users.User> userList18 = headLabCoordinator0.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList19 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.User user20 = null;
        headLabCoordinator0.rejectUser(user20);
        com.yorku.coordinator.LabManager labManager26 = headLabCoordinator0.generateLabManager("", "", "hi!", "hi!");
        java.util.List<com.yorku.users.User> userList27 = headLabCoordinator0.getPendingApprovals();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertNotNull(userList27);
    }

    @Test
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Faculty faculty10 = new com.yorku.users.Faculty("hi!", "hi!", "");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade11.cancelReservation(user12, equipment16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator19 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        double double24 = researcher23.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher23);
        java.lang.String str26 = researcher23.getPassword();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher23);
        com.yorku.coordinator.LabManager labManager29 = new com.yorku.coordinator.LabManager("");
        labManager29.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList32 = labManager29.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade33.cancelReservation(user34, equipment38);
        com.yorku.equipment.Equipment equipment40 = equipment38.clone();
        equipment40.setAvailable(true);
        labManager29.addEquipment(equipment40);
        com.yorku.command.ExtendCommand extendCommand45 = new com.yorku.command.ExtendCommand(bookingFacade11, (com.yorku.users.User) researcher23, equipment40, (int) (byte) 100);
        com.yorku.booking.BookingFacade bookingFacade46 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user47 = null;
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand53 = new com.yorku.command.ExtendCommand(bookingFacade46, user47, equipment51, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator54 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher58 = new com.yorku.users.Researcher("", "", "hi!");
        double double59 = researcher58.getHourlyRate();
        headLabCoordinator54.approveUser((com.yorku.users.User) researcher58);
        com.yorku.booking.BookingFacade bookingFacade61 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user62 = null;
        com.yorku.equipment.Equipment equipment66 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade61.cancelReservation(user62, equipment66);
        com.yorku.command.ReserveCommand reserveCommand69 = new com.yorku.command.ReserveCommand(bookingFacade46, (com.yorku.users.User) researcher58, equipment66, (int) (byte) 0);
        double double70 = researcher58.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.equipment.Equipment equipment78 = equipment76.clone();
        equipment76.setLocation("");
        boolean boolean81 = equipment76.isAvailable();
        bookingFacade11.extendReservation((com.yorku.users.User) researcher58, equipment76, (int) 'a');
        bookingFacade0.reserveEquipment((com.yorku.users.User) faculty10, equipment76, 0);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(equipment40);
        org.junit.Assert.assertNotNull(headLabCoordinator54);
        org.junit.Assert.assertTrue("'" + double59 + "' != '" + 20.0d + "'", double59 == 20.0d);
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 20.0d + "'", double70 == 20.0d);
        org.junit.Assert.assertNotNull(equipment78);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + true + "'", boolean81 == true);
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.UserRegistry userRegistry7 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean9 = userRegistry7.isEmailRegistered("");
        com.yorku.users.User user11 = userRegistry7.getUserByEmail("hi!");
        com.yorku.users.User user13 = userRegistry7.getUserByEmail("hi!");
        com.yorku.users.User user15 = userRegistry7.getUserByEmail("hi!");
        com.yorku.users.User user17 = userRegistry7.getUserByEmail("hi!");
        headLabCoordinator0.approveUser(user17);
        java.util.List<com.yorku.users.User> userList19 = headLabCoordinator0.getPendingApprovals();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(user11);
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertNotNull(user15);
        org.junit.Assert.assertNotNull(user17);
        org.junit.Assert.assertNotNull(userList19);
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        java.lang.String str8 = researcher5.getPassword();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher5);
        com.yorku.coordinator.LabManager labManager14 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        com.yorku.coordinator.LabManager labManager19 = headLabCoordinator0.generateLabManager("", "", "", "hi!");
        com.yorku.equipment.Equipment equipment21 = labManager19.getEquipment("");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(labManager19);
        org.junit.Assert.assertNull(equipment21);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.notifyObservers("");
        sensor0.notifyObservers("");
        sensor0.detectUsage("");
        com.yorku.observer.Sensor sensor9 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor10 = new com.yorku.observer.EquipmentMonitor();
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor10);
        com.yorku.observer.EquipmentMonitor equipmentMonitor12 = new com.yorku.observer.EquipmentMonitor();
        equipmentMonitor12.update("");
        sensor9.attach((com.yorku.observer.Observer) equipmentMonitor12);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor12);
        sensor0.detectUsage("hi!");
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand33 = new com.yorku.command.ExtendCommand(bookingFacade26, user27, equipment31, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        com.yorku.booking.BookingFacade bookingFacade41 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user42 = null;
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade41.cancelReservation(user42, equipment46);
        com.yorku.command.ReserveCommand reserveCommand49 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher38, equipment46, (int) (byte) 0);
        com.yorku.users.Researcher researcher53 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status54 = null;
        researcher53.setStatus(status54);
        com.yorku.booking.BookingFacade bookingFacade56 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user57 = null;
        com.yorku.equipment.Equipment equipment61 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand63 = new com.yorku.command.ExtendCommand(bookingFacade56, user57, equipment61, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator64 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator64.approveUser((com.yorku.users.User) researcher68);
        com.yorku.booking.BookingFacade bookingFacade71 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user72 = null;
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade71.cancelReservation(user72, equipment76);
        com.yorku.command.ReserveCommand reserveCommand79 = new com.yorku.command.ReserveCommand(bookingFacade56, (com.yorku.users.User) researcher68, equipment76, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand81 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) researcher53, equipment76, 0);
        com.yorku.users.User.Status status82 = researcher53.getStatus();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher53);
        com.yorku.coordinator.LabManager labManager88 = headLabCoordinator0.generateLabManager("hi!", "hi!", "hi!", "hi!");
        com.yorku.coordinator.LabManager labManager93 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        java.util.List<com.yorku.equipment.Equipment> equipmentList94 = labManager93.getAvailableEquipment();
        java.util.List<com.yorku.equipment.Equipment> equipmentList95 = labManager93.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment97 = labManager93.getEquipmentById("");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator64);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertNull(status82);
        org.junit.Assert.assertNotNull(labManager88);
        org.junit.Assert.assertNotNull(labManager93);
        org.junit.Assert.assertNotNull(equipmentList94);
        org.junit.Assert.assertNotNull(equipmentList95);
        org.junit.Assert.assertNull(equipment97);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getLocation();
        labManager1.addEquipment(equipment15);
        com.yorku.equipment.Equipment equipment19 = labManager1.getEquipment("hi!");
        com.yorku.equipment.Equipment equipment21 = labManager1.getEquipmentById("");
        java.lang.String str22 = labManager1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertNull(equipment21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        java.util.List<com.yorku.users.User> userList18 = headLabCoordinator0.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList19 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.User user20 = null;
        headLabCoordinator0.rejectUser(user20);
        com.yorku.coordinator.LabManager labManager26 = headLabCoordinator0.generateLabManager("", "", "hi!", "hi!");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator27 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher31 = new com.yorku.users.Researcher("", "", "hi!");
        double double32 = researcher31.getHourlyRate();
        headLabCoordinator27.approveUser((com.yorku.users.User) researcher31);
        com.yorku.users.Researcher researcher37 = new com.yorku.users.Researcher("", "", "hi!");
        double double38 = researcher37.getHourlyRate();
        headLabCoordinator27.approveUser((com.yorku.users.User) researcher37);
        com.yorku.users.Faculty faculty43 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator27.rejectUser((com.yorku.users.User) faculty43);
        java.lang.String str45 = faculty43.getIdNumber();
        java.lang.String str46 = faculty43.getEmail();
        java.lang.String str47 = faculty43.getEmail();
        headLabCoordinator0.approveUser((com.yorku.users.User) faculty43);
        boolean boolean49 = faculty43.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertNotNull(headLabCoordinator27);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 20.0d + "'", double32 == 20.0d);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 20.0d + "'", double38 == 20.0d);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user6 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user8 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user10 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand18 = new com.yorku.command.ExtendCommand(bookingFacade11, user12, equipment16, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator19 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        double double24 = researcher23.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher23);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade26.cancelReservation(user27, equipment31);
        com.yorku.command.ReserveCommand reserveCommand34 = new com.yorku.command.ReserveCommand(bookingFacade11, (com.yorku.users.User) researcher23, equipment31, (int) (byte) 0);
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status39 = null;
        researcher38.setStatus(status39);
        double double41 = researcher38.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user43 = null;
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade42.cancelReservation(user43, equipment47);
        java.lang.String str49 = equipment47.getLocation();
        boolean boolean50 = equipment47.isAvailable();
        com.yorku.command.ExtendCommand extendCommand52 = new com.yorku.command.ExtendCommand(bookingFacade11, (com.yorku.users.User) researcher38, equipment47, (int) (byte) 100);
        java.lang.String str53 = researcher38.getIdNumber();
        userRegistry0.registerUser((com.yorku.users.User) researcher38);
        com.yorku.users.User user56 = userRegistry0.getUserByEmail("");
        com.yorku.users.UserRegistry userRegistry57 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean59 = userRegistry57.isEmailRegistered("");
        com.yorku.users.User user61 = userRegistry57.getUserByEmail("hi!");
        boolean boolean63 = userRegistry57.isEmailRegistered("");
        boolean boolean65 = userRegistry57.isEmailRegistered("");
        com.yorku.users.Researcher researcher69 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status70 = null;
        researcher69.setStatus(status70);
        com.yorku.users.User.Status status72 = null;
        researcher69.setStatus(status72);
        com.yorku.users.User.Status status74 = researcher69.getStatus();
        userRegistry57.registerUser((com.yorku.users.User) researcher69);
        boolean boolean77 = userRegistry57.isEmailRegistered("hi!");
        com.yorku.users.User user79 = userRegistry57.getUserByEmail("");
        com.yorku.users.Researcher researcher83 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status84 = null;
        researcher83.setStatus(status84);
        com.yorku.users.User.Status status86 = null;
        researcher83.setStatus(status86);
        com.yorku.users.User.Status status88 = researcher83.getStatus();
        userRegistry57.registerUser((com.yorku.users.User) researcher83);
        com.yorku.users.User user91 = userRegistry57.getUserByEmail("hi!");
        com.yorku.users.User.Status status92 = user91.getStatus();
        userRegistry0.registerUser(user91);
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 20.0d + "'", double41 == 20.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(userRegistry57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNull(status74);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(user79);
        org.junit.Assert.assertNull(status88);
        org.junit.Assert.assertNotNull(user91);
        org.junit.Assert.assertTrue("'" + status92 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status92.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean24 = faculty23.isUniversityAffiliated();
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str29 = equipment28.getDescription();
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.command.ExtendCommand extendCommand32 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) faculty23, equipment28, (int) (byte) 100);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator33 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher37 = new com.yorku.users.Researcher("", "", "hi!");
        double double38 = researcher37.getHourlyRate();
        headLabCoordinator33.approveUser((com.yorku.users.User) researcher37);
        com.yorku.users.Researcher researcher43 = new com.yorku.users.Researcher("", "", "hi!");
        double double44 = researcher43.getHourlyRate();
        headLabCoordinator33.approveUser((com.yorku.users.User) researcher43);
        com.yorku.booking.BookingFacade bookingFacade46 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user47 = null;
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand53 = new com.yorku.command.ExtendCommand(bookingFacade46, user47, equipment51, 0);
        equipment51.setAvailable(true);
        java.lang.String str56 = equipment51.getLocation();
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher43, equipment51);
        com.yorku.users.Student student61 = new com.yorku.users.Student("", "", "hi!");
        com.yorku.coordinator.LabManager labManager63 = new com.yorku.coordinator.LabManager("");
        labManager63.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList66 = labManager63.getAllEquipmentIds();
        labManager63.enableEquipment("hi!");
        java.lang.String str69 = labManager63.getName();
        labManager63.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList72 = labManager63.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment76 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        labManager63.addEquipment(equipment76);
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection78 = labManager63.getAllEquipment();
        java.util.List<java.lang.String> strList79 = labManager63.getAllEquipmentIds();
        com.yorku.equipment.Equipment equipment83 = new com.yorku.equipment.Equipment("hi!", "hi!", "");
        labManager63.addEquipment(equipment83);
        com.yorku.command.CancelCommand cancelCommand85 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student61, equipment83);
        java.lang.String str86 = student61.getIdNumber();
        java.lang.String str87 = student61.getIdNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertNotNull(headLabCoordinator33);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 20.0d + "'", double38 == 20.0d);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 20.0d + "'", double44 == 20.0d);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertNotNull(equipmentList72);
        org.junit.Assert.assertNotNull(equipmentCollection78);
        org.junit.Assert.assertNotNull(strList79);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "hi!" + "'", str86, "hi!");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "hi!" + "'", str87, "hi!");
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor11 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor12 = new com.yorku.observer.EquipmentMonitor();
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor12);
        sensor11.detectUsage("hi!");
        sensor11.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor18 = new com.yorku.observer.EquipmentMonitor();
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor18);
        sensor11.notifyObservers("");
        sensor11.notifyObservers("hi!");
        sensor11.detectUsage("hi!");
        com.yorku.observer.Sensor sensor26 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor27 = new com.yorku.observer.EquipmentMonitor();
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor27);
        sensor26.detectUsage("hi!");
        sensor26.detectUsage("");
        com.yorku.observer.Sensor sensor33 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor34 = new com.yorku.observer.EquipmentMonitor();
        sensor33.attach((com.yorku.observer.Observer) equipmentMonitor34);
        sensor33.detectUsage("hi!");
        sensor33.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor40 = new com.yorku.observer.EquipmentMonitor();
        sensor33.attach((com.yorku.observer.Observer) equipmentMonitor40);
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor40);
        com.yorku.observer.Sensor sensor43 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor44 = new com.yorku.observer.EquipmentMonitor();
        sensor43.attach((com.yorku.observer.Observer) equipmentMonitor44);
        equipmentMonitor44.update("hi!");
        equipmentMonitor44.update("");
        sensor26.attach((com.yorku.observer.Observer) equipmentMonitor44);
        equipmentMonitor44.update("");
        equipmentMonitor44.update("");
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor44);
        sensor11.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor58 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor59 = new com.yorku.observer.EquipmentMonitor();
        sensor58.attach((com.yorku.observer.Observer) equipmentMonitor59);
        equipmentMonitor59.update("");
        equipmentMonitor59.update("");
        sensor11.attach((com.yorku.observer.Observer) equipmentMonitor59);
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor59);
        equipmentMonitor59.update("");
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getLocation();
        labManager1.addEquipment(equipment15);
        com.yorku.equipment.Equipment equipment19 = labManager1.getEquipment("hi!");
        labManager1.markForMaintenance("hi!");
        labManager1.disableEquipment("");
        java.lang.String str24 = labManager1.getEmail();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.equipment.Equipment equipment7 = equipment5.clone();
        com.yorku.equipment.Equipment equipment8 = equipment7.clone();
        equipment8.setLocation("");
        com.yorku.equipment.Equipment equipment11 = equipment8.clone();
        equipment11.setAvailable(true);
        boolean boolean14 = equipment11.isAvailable();
        java.lang.String str15 = equipment11.getLocation();
        org.junit.Assert.assertNotNull(equipment7);
        org.junit.Assert.assertNotNull(equipment8);
        org.junit.Assert.assertNotNull(equipment11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        java.lang.String str24 = equipment20.getDescription();
        com.yorku.equipment.Equipment equipment25 = equipment20.clone();
        equipment20.setDescription("hi!");
        java.lang.String str28 = equipment20.getDescription();
        java.lang.String str29 = equipment20.getId();
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(equipment25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        com.yorku.users.Guest guest3 = new com.yorku.users.Guest("", "", "hi!");
        java.lang.String str4 = guest3.getEmail();
        boolean boolean5 = guest3.isUniversityAffiliated();
        java.lang.String str6 = guest3.getIdNumber();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest7 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment11 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str12 = equipment11.getLocation();
        java.lang.String str13 = equipment11.getDescription();
        java.lang.String str14 = equipment11.getDescription();
        bookingFacade3.cancelReservation((com.yorku.users.User) guest7, equipment11);
        userRegistry0.registerUser((com.yorku.users.User) guest7);
        java.lang.String str17 = guest7.getIdNumber();
        boolean boolean18 = guest7.isUniversityAffiliated();
        double double19 = guest7.getHourlyRate();
        double double20 = guest7.getHourlyRate();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher6 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status7 = null;
        researcher6.setStatus(status7);
        double double9 = researcher6.getHourlyRate();
        java.lang.String str10 = researcher6.getPassword();
        userRegistry0.registerUser((com.yorku.users.User) researcher6);
        com.yorku.users.User user13 = userRegistry0.getUserByEmail("hi!");
        boolean boolean14 = user13.isUniversityAffiliated();
        java.lang.String str15 = user13.getEmail();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(user13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        java.lang.String str7 = labManager1.getPassword();
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(equipmentList10);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.coordinator.LabManager labManager30 = headLabCoordinator0.generateLabManager("hi!", "", "", "hi!");
        com.yorku.equipment.Equipment equipment34 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str35 = equipment34.getLocation();
        java.lang.String str36 = equipment34.getDescription();
        com.yorku.equipment.Equipment equipment37 = equipment34.clone();
        java.lang.String str38 = equipment34.getId();
        labManager30.addEquipment(equipment34);
        java.lang.String str40 = equipment34.getLocation();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(equipment37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.Researcher researcher6 = new com.yorku.users.Researcher("", "", "");
        userRegistry0.registerUser((com.yorku.users.User) researcher6);
        com.yorku.users.User user9 = userRegistry0.getUserByEmail("hi!");
        boolean boolean10 = user9.isUniversityAffiliated();
        com.yorku.users.User.Status status11 = user9.getStatus();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + status11 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status11.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "hi!", "");
        labManager1.addEquipment(equipment14);
        java.lang.String str16 = labManager1.getPassword();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Faculty faculty10 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade11.cancelReservation(user12, equipment16);
        com.yorku.equipment.Equipment equipment18 = equipment16.clone();
        com.yorku.equipment.Equipment equipment19 = equipment18.clone();
        equipment19.setLocation("");
        com.yorku.command.CancelCommand cancelCommand22 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) faculty10, equipment19);
        com.yorku.users.User.Status status23 = faculty10.getStatus();
        org.junit.Assert.assertNotNull(equipment18);
        org.junit.Assert.assertNotNull(equipment19);
        org.junit.Assert.assertTrue("'" + status23 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status23.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("hi!");
        java.lang.String str2 = labManager1.getPassword();
        java.util.List<com.yorku.equipment.Equipment> equipmentList3 = labManager1.getAvailableEquipment();
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList6 = labManager1.getAllEquipmentIds();
        java.lang.Class<?> wildcardClass7 = labManager1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(equipmentList3);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.UserRegistry userRegistry1 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean3 = userRegistry1.isEmailRegistered("");
        com.yorku.users.User user5 = userRegistry1.getUserByEmail("hi!");
        boolean boolean7 = userRegistry1.isEmailRegistered("");
        boolean boolean9 = userRegistry1.isEmailRegistered("");
        com.yorku.users.Researcher researcher13 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status14 = null;
        researcher13.setStatus(status14);
        com.yorku.users.User.Status status16 = null;
        researcher13.setStatus(status16);
        com.yorku.users.User.Status status18 = researcher13.getStatus();
        userRegistry1.registerUser((com.yorku.users.User) researcher13);
        boolean boolean21 = userRegistry1.isEmailRegistered("hi!");
        com.yorku.users.User user23 = userRegistry1.getUserByEmail("");
        com.yorku.users.User user25 = userRegistry1.getUserByEmail("");
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade26.cancelReservation(user27, equipment31);
        com.yorku.users.Researcher researcher36 = new com.yorku.users.Researcher("", "", "hi!");
        double double37 = researcher36.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade38 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user39 = null;
        com.yorku.equipment.Equipment equipment43 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade38.cancelReservation(user39, equipment43);
        com.yorku.equipment.Equipment equipment45 = equipment43.clone();
        com.yorku.equipment.Equipment equipment46 = equipment45.clone();
        bookingFacade26.reserveEquipment((com.yorku.users.User) researcher36, equipment45, 1);
        com.yorku.users.Student student52 = new com.yorku.users.Student("", "", "");
        double double53 = student52.getHourlyRate();
        com.yorku.equipment.Equipment equipment57 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str58 = equipment57.getLocation();
        java.lang.String str59 = equipment57.getDescription();
        com.yorku.equipment.Equipment equipment60 = equipment57.clone();
        com.yorku.command.ExtendCommand extendCommand62 = new com.yorku.command.ExtendCommand(bookingFacade26, (com.yorku.users.User) student52, equipment60, (int) (short) -1);
        com.yorku.command.CancelCommand cancelCommand63 = new com.yorku.command.CancelCommand(bookingFacade0, user25, equipment60);
        com.yorku.users.Researcher researcher67 = new com.yorku.users.Researcher("", "", "hi!");
        double double68 = researcher67.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade69 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user70 = null;
        com.yorku.equipment.Equipment equipment74 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade69.cancelReservation(user70, equipment74);
        com.yorku.users.Guest guest79 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double80 = guest79.getHourlyRate();
        com.yorku.equipment.Equipment equipment84 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str85 = equipment84.getId();
        com.yorku.command.ExtendCommand extendCommand87 = new com.yorku.command.ExtendCommand(bookingFacade69, (com.yorku.users.User) guest79, equipment84, (int) (short) -1);
        com.yorku.equipment.Equipment equipment88 = equipment84.clone();
        bookingFacade0.extendReservation((com.yorku.users.User) researcher67, equipment88, 100);
        double double91 = researcher67.getHourlyRate();
        double double92 = researcher67.getHourlyRate();
        org.junit.Assert.assertNotNull(userRegistry1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(user5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull(status18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(user23);
        org.junit.Assert.assertNotNull(user25);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 20.0d + "'", double37 == 20.0d);
        org.junit.Assert.assertNotNull(equipment45);
        org.junit.Assert.assertNotNull(equipment46);
        org.junit.Assert.assertTrue("'" + double53 + "' != '" + 10.0d + "'", double53 == 10.0d);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "hi!" + "'", str58, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(equipment60);
        org.junit.Assert.assertTrue("'" + double68 + "' != '" + 20.0d + "'", double68 == 20.0d);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 30.0d + "'", double80 == 30.0d);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hi!" + "'", str85, "hi!");
        org.junit.Assert.assertNotNull(equipment88);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 20.0d + "'", double91 == 20.0d);
        org.junit.Assert.assertTrue("'" + double92 + "' != '" + 20.0d + "'", double92 == 20.0d);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        java.util.List<java.lang.String> strList10 = labManager1.getAllEquipmentIds();
        java.lang.String str11 = labManager1.getName();
        com.yorku.equipment.Equipment equipment13 = labManager1.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment15 = labManager1.getEquipmentById("hi!");
        com.yorku.coordinator.LabManager labManager17 = new com.yorku.coordinator.LabManager("");
        labManager17.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList20 = labManager17.getAllEquipmentIds();
        labManager17.enableEquipment("hi!");
        java.lang.String str23 = labManager17.getName();
        labManager17.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList26 = labManager17.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        labManager17.addEquipment(equipment30);
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection32 = labManager17.getAllEquipment();
        java.util.List<java.lang.String> strList33 = labManager17.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade34 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user35 = null;
        com.yorku.equipment.Equipment equipment39 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade34.cancelReservation(user35, equipment39);
        com.yorku.users.Researcher researcher44 = new com.yorku.users.Researcher("", "", "hi!");
        double double45 = researcher44.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade46 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user47 = null;
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade46.cancelReservation(user47, equipment51);
        com.yorku.equipment.Equipment equipment53 = equipment51.clone();
        com.yorku.equipment.Equipment equipment54 = equipment53.clone();
        bookingFacade34.reserveEquipment((com.yorku.users.User) researcher44, equipment53, 1);
        labManager17.addEquipment(equipment53);
        labManager1.addEquipment(equipment53);
        java.lang.String str59 = equipment53.getLocation();
        equipment53.setAvailable(false);
        java.lang.String str62 = equipment53.getId();
        boolean boolean63 = equipment53.isAvailable();
        java.lang.String str64 = equipment53.getDescription();
        equipment53.setAvailable(false);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(equipment13);
        org.junit.Assert.assertNull(equipment15);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertNotNull(equipmentList26);
        org.junit.Assert.assertNotNull(equipmentCollection32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 20.0d + "'", double45 == 20.0d);
        org.junit.Assert.assertNotNull(equipment53);
        org.junit.Assert.assertNotNull(equipment54);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade15.cancelReservation(user16, equipment20);
        com.yorku.command.ReserveCommand reserveCommand23 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment20, (int) (byte) 0);
        com.yorku.users.Researcher researcher27 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status28 = null;
        researcher27.setStatus(status28);
        com.yorku.booking.BookingFacade bookingFacade30 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user31 = null;
        com.yorku.equipment.Equipment equipment35 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand37 = new com.yorku.command.ExtendCommand(bookingFacade30, user31, equipment35, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator38 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher42 = new com.yorku.users.Researcher("", "", "hi!");
        double double43 = researcher42.getHourlyRate();
        headLabCoordinator38.approveUser((com.yorku.users.User) researcher42);
        com.yorku.booking.BookingFacade bookingFacade45 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user46 = null;
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade45.cancelReservation(user46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand53 = new com.yorku.command.ReserveCommand(bookingFacade30, (com.yorku.users.User) researcher42, equipment50, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand55 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher27, equipment50, 0);
        com.yorku.users.User user56 = null;
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator58 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher62 = new com.yorku.users.Researcher("", "", "hi!");
        double double63 = researcher62.getHourlyRate();
        headLabCoordinator58.approveUser((com.yorku.users.User) researcher62);
        com.yorku.users.Researcher researcher68 = new com.yorku.users.Researcher("", "", "hi!");
        double double69 = researcher68.getHourlyRate();
        headLabCoordinator58.approveUser((com.yorku.users.User) researcher68);
        com.yorku.equipment.Equipment equipment74 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str75 = equipment74.getId();
        com.yorku.command.CancelCommand cancelCommand76 = new com.yorku.command.CancelCommand(bookingFacade57, (com.yorku.users.User) researcher68, equipment74);
        java.lang.String str77 = equipment74.getId();
        com.yorku.command.CancelCommand cancelCommand78 = new com.yorku.command.CancelCommand(bookingFacade0, user56, equipment74);
        java.lang.String str79 = equipment74.getLocation();
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator38);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 20.0d + "'", double43 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator58);
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 20.0d + "'", double63 == 20.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        java.util.List<com.yorku.users.User> userList1 = headLabCoordinator0.getPendingApprovals();
        com.yorku.booking.BookingFacade bookingFacade2 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user3 = null;
        com.yorku.equipment.Equipment equipment7 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade2.cancelReservation(user3, equipment7);
        com.yorku.booking.BookingFacade bookingFacade9 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator10 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher14 = new com.yorku.users.Researcher("", "", "hi!");
        double double15 = researcher14.getHourlyRate();
        headLabCoordinator10.approveUser((com.yorku.users.User) researcher14);
        com.yorku.users.Researcher researcher20 = new com.yorku.users.Researcher("", "", "hi!");
        double double21 = researcher20.getHourlyRate();
        headLabCoordinator10.approveUser((com.yorku.users.User) researcher20);
        com.yorku.equipment.Equipment equipment26 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str27 = equipment26.getId();
        com.yorku.command.CancelCommand cancelCommand28 = new com.yorku.command.CancelCommand(bookingFacade9, (com.yorku.users.User) researcher20, equipment26);
        com.yorku.equipment.Equipment equipment32 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str33 = equipment32.getLocation();
        java.lang.String str34 = equipment32.getDescription();
        com.yorku.command.ExtendCommand extendCommand36 = new com.yorku.command.ExtendCommand(bookingFacade2, (com.yorku.users.User) researcher20, equipment32, (int) '#');
        com.yorku.booking.BookingFacade bookingFacade37 = null;
        com.yorku.users.Researcher researcher41 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status42 = null;
        researcher41.setStatus(status42);
        com.yorku.users.User.Status status44 = null;
        researcher41.setStatus(status44);
        com.yorku.equipment.Equipment equipment49 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment49.setDescription("");
        java.lang.String str52 = equipment49.getDescription();
        equipment49.setAvailable(false);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade37, (com.yorku.users.User) researcher41, equipment49, (int) (byte) 100);
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user58 = null;
        com.yorku.equipment.Equipment equipment62 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade57.cancelReservation(user58, equipment62);
        com.yorku.equipment.Equipment equipment64 = equipment62.clone();
        com.yorku.equipment.Equipment equipment65 = equipment64.clone();
        equipment65.setLocation("");
        bookingFacade2.extendReservation((com.yorku.users.User) researcher41, equipment65, (int) (short) 0);
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher41);
        com.yorku.coordinator.LabManager labManager75 = headLabCoordinator0.generateLabManager("", "hi!", "", "hi!");
        com.yorku.equipment.Equipment equipment77 = labManager75.getEquipment("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(headLabCoordinator10);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "hi!" + "'", str27, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(equipment64);
        org.junit.Assert.assertNotNull(equipment65);
        org.junit.Assert.assertNotNull(labManager75);
        org.junit.Assert.assertNull(equipment77);
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        java.lang.String str8 = researcher5.getPassword();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher5);
        com.yorku.coordinator.LabManager labManager14 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator16 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher20 = new com.yorku.users.Researcher("", "", "hi!");
        double double21 = researcher20.getHourlyRate();
        headLabCoordinator16.approveUser((com.yorku.users.User) researcher20);
        com.yorku.users.Researcher researcher26 = new com.yorku.users.Researcher("", "", "hi!");
        double double27 = researcher26.getHourlyRate();
        headLabCoordinator16.approveUser((com.yorku.users.User) researcher26);
        com.yorku.equipment.Equipment equipment32 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str33 = equipment32.getId();
        com.yorku.command.CancelCommand cancelCommand34 = new com.yorku.command.CancelCommand(bookingFacade15, (com.yorku.users.User) researcher26, equipment32);
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status39 = null;
        researcher38.setStatus(status39);
        com.yorku.booking.BookingFacade bookingFacade41 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user42 = null;
        com.yorku.equipment.Equipment equipment46 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand48 = new com.yorku.command.ExtendCommand(bookingFacade41, user42, equipment46, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator49 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher53 = new com.yorku.users.Researcher("", "", "hi!");
        double double54 = researcher53.getHourlyRate();
        headLabCoordinator49.approveUser((com.yorku.users.User) researcher53);
        com.yorku.booking.BookingFacade bookingFacade56 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user57 = null;
        com.yorku.equipment.Equipment equipment61 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade56.cancelReservation(user57, equipment61);
        com.yorku.command.ReserveCommand reserveCommand64 = new com.yorku.command.ReserveCommand(bookingFacade41, (com.yorku.users.User) researcher53, equipment61, (int) (byte) 0);
        bookingFacade15.cancelReservation((com.yorku.users.User) researcher38, equipment61);
        com.yorku.users.UserRegistry userRegistry66 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean68 = userRegistry66.isEmailRegistered("");
        com.yorku.users.Researcher researcher72 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status73 = null;
        researcher72.setStatus(status73);
        double double75 = researcher72.getHourlyRate();
        java.lang.String str76 = researcher72.getPassword();
        userRegistry66.registerUser((com.yorku.users.User) researcher72);
        boolean boolean79 = userRegistry66.isEmailRegistered("");
        com.yorku.users.User user81 = userRegistry66.getUserByEmail("");
        com.yorku.booking.BookingFacade bookingFacade82 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user83 = null;
        com.yorku.equipment.Equipment equipment87 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade82.cancelReservation(user83, equipment87);
        com.yorku.equipment.Equipment equipment89 = equipment87.clone();
        java.lang.String str90 = equipment89.getDescription();
        java.lang.String str91 = equipment89.getLocation();
        com.yorku.command.ExtendCommand extendCommand93 = new com.yorku.command.ExtendCommand(bookingFacade15, user81, equipment89, 0);
        java.lang.String str94 = user81.getEmail();
        headLabCoordinator0.rejectUser(user81);
        java.lang.String str96 = user81.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(headLabCoordinator16);
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 20.0d + "'", double21 == 20.0d);
        org.junit.Assert.assertTrue("'" + double27 + "' != '" + 20.0d + "'", double27 == 20.0d);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator49);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 20.0d + "'", double54 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 20.0d + "'", double75 == 20.0d);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "" + "'", str76, "");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(user81);
        org.junit.Assert.assertNotNull(equipment89);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertEquals("'" + str94 + "' != '" + "" + "'", str94, "");
        org.junit.Assert.assertEquals("'" + str96 + "' != '" + "" + "'", str96, "");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.users.Researcher researcher29 = new com.yorku.users.Researcher("hi!", "hi!", "hi!");
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher29);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator31 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher35 = new com.yorku.users.Researcher("", "", "hi!");
        double double36 = researcher35.getHourlyRate();
        headLabCoordinator31.approveUser((com.yorku.users.User) researcher35);
        com.yorku.users.Researcher researcher41 = new com.yorku.users.Researcher("", "", "hi!");
        double double42 = researcher41.getHourlyRate();
        headLabCoordinator31.approveUser((com.yorku.users.User) researcher41);
        com.yorku.users.Faculty faculty47 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator31.rejectUser((com.yorku.users.User) faculty47);
        java.lang.String str49 = faculty47.getIdNumber();
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty47);
        com.yorku.users.User.Status status51 = faculty47.getStatus();
        boolean boolean52 = faculty47.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator31);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertTrue("'" + status51 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status51.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList10 = labManager1.getAllEquipmentIds();
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        java.util.List<java.lang.String> strList12 = labManager1.getAllEquipmentIds();
        java.util.List<com.yorku.equipment.Equipment> equipmentList13 = labManager1.getAvailableEquipment();
        java.util.List<java.lang.String> strList14 = labManager1.getAllEquipmentIds();
        java.util.List<java.lang.String> strList15 = labManager1.getAllEquipmentIds();
        java.lang.String str16 = labManager1.getEmail();
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment20.setDescription("");
        equipment20.setDescription("hi!");
        labManager1.addEquipment(equipment20);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(equipmentList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        boolean boolean8 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status13 = null;
        researcher12.setStatus(status13);
        com.yorku.users.User.Status status15 = null;
        researcher12.setStatus(status15);
        com.yorku.users.User.Status status17 = researcher12.getStatus();
        userRegistry0.registerUser((com.yorku.users.User) researcher12);
        boolean boolean20 = userRegistry0.isEmailRegistered("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(status17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        labManager1.addEquipment(equipment14);
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection16 = labManager1.getAllEquipment();
        labManager1.disableEquipment("hi!");
        labManager1.disableEquipment("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentCollection16);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.lang.String str11 = labManager1.getName();
        labManager1.enableEquipment("hi!");
        java.lang.String str14 = labManager1.getName();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.UserRegistry userRegistry3 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean5 = userRegistry3.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade6 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest10 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str15 = equipment14.getLocation();
        java.lang.String str16 = equipment14.getDescription();
        java.lang.String str17 = equipment14.getDescription();
        bookingFacade6.cancelReservation((com.yorku.users.User) guest10, equipment14);
        userRegistry3.registerUser((com.yorku.users.User) guest10);
        com.yorku.users.User.Status status20 = null;
        guest10.setStatus(status20);
        userRegistry0.registerUser((com.yorku.users.User) guest10);
        double double23 = guest10.getHourlyRate();
        double double24 = guest10.getHourlyRate();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(userRegistry3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 30.0d + "'", double24 == 30.0d);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        com.yorku.equipment.Equipment equipment3 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str4 = equipment3.getId();
        java.lang.String str5 = equipment3.getLocation();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection12 = labManager1.getAllEquipment();
        java.util.List<com.yorku.equipment.Equipment> equipmentList13 = labManager1.getAvailableEquipment();
        labManager1.markForMaintenance("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentCollection12);
        org.junit.Assert.assertNotNull(equipmentList13);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        java.lang.String str11 = labManager1.getPassword();
        java.util.List<java.lang.String> strList12 = labManager1.getAllEquipmentIds();
        java.util.List<java.lang.String> strList13 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor7 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor7);
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.detectUsage("hi!");
        com.yorku.observer.Sensor sensor15 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor16 = new com.yorku.observer.EquipmentMonitor();
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor16);
        sensor15.detectUsage("hi!");
        sensor15.detectUsage("");
        com.yorku.observer.Sensor sensor22 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor23 = new com.yorku.observer.EquipmentMonitor();
        sensor22.attach((com.yorku.observer.Observer) equipmentMonitor23);
        sensor22.detectUsage("hi!");
        sensor22.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor29 = new com.yorku.observer.EquipmentMonitor();
        sensor22.attach((com.yorku.observer.Observer) equipmentMonitor29);
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor29);
        com.yorku.observer.Sensor sensor32 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor33 = new com.yorku.observer.EquipmentMonitor();
        sensor32.attach((com.yorku.observer.Observer) equipmentMonitor33);
        equipmentMonitor33.update("hi!");
        equipmentMonitor33.update("");
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor33);
        equipmentMonitor33.update("");
        equipmentMonitor33.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor33);
        sensor0.notifyObservers("hi!");
        com.yorku.observer.Sensor sensor47 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor48 = new com.yorku.observer.EquipmentMonitor();
        sensor47.attach((com.yorku.observer.Observer) equipmentMonitor48);
        equipmentMonitor48.update("");
        equipmentMonitor48.update("");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor48);
        sensor0.notifyObservers("hi!");
        sensor0.notifyObservers("hi!");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.UserRegistry userRegistry20 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean22 = userRegistry20.isEmailRegistered("hi!");
        com.yorku.users.Researcher researcher26 = new com.yorku.users.Researcher("", "", "");
        userRegistry20.registerUser((com.yorku.users.User) researcher26);
        com.yorku.booking.BookingFacade bookingFacade28 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user29 = null;
        com.yorku.equipment.Equipment equipment33 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade28.cancelReservation(user29, equipment33);
        com.yorku.equipment.Equipment equipment35 = equipment33.clone();
        com.yorku.command.ReserveCommand reserveCommand37 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher26, equipment35, (int) 'a');
        com.yorku.users.User user38 = null;
        com.yorku.booking.BookingFacade bookingFacade39 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator40 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher44 = new com.yorku.users.Researcher("", "", "hi!");
        double double45 = researcher44.getHourlyRate();
        headLabCoordinator40.approveUser((com.yorku.users.User) researcher44);
        com.yorku.users.Researcher researcher50 = new com.yorku.users.Researcher("", "", "hi!");
        double double51 = researcher50.getHourlyRate();
        headLabCoordinator40.approveUser((com.yorku.users.User) researcher50);
        com.yorku.equipment.Equipment equipment56 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str57 = equipment56.getId();
        com.yorku.command.CancelCommand cancelCommand58 = new com.yorku.command.CancelCommand(bookingFacade39, (com.yorku.users.User) researcher50, equipment56);
        java.lang.String str59 = equipment56.getId();
        equipment56.setDescription("");
        java.lang.String str62 = equipment56.getDescription();
        java.lang.String str63 = equipment56.getId();
        java.lang.String str64 = equipment56.getId();
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade0.reserveEquipment(user38, equipment56, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.users.User.getHourlyRate()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(userRegistry20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(equipment35);
        org.junit.Assert.assertNotNull(headLabCoordinator40);
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 20.0d + "'", double45 == 20.0d);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 20.0d + "'", double51 == 20.0d);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "hi!" + "'", str57, "hi!");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        com.yorku.users.Faculty faculty3 = new com.yorku.users.Faculty("hi!", "", "");
        double double4 = faculty3.getHourlyRate();
        java.lang.String str5 = faculty3.getIdNumber();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 15.0d + "'", double4 == 15.0d);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.booking.BookingFacade bookingFacade7 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        com.yorku.users.Researcher researcher18 = new com.yorku.users.Researcher("", "", "hi!");
        double double19 = researcher18.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher18);
        com.yorku.equipment.Equipment equipment24 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str25 = equipment24.getId();
        com.yorku.command.CancelCommand cancelCommand26 = new com.yorku.command.CancelCommand(bookingFacade7, (com.yorku.users.User) researcher18, equipment24);
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        java.lang.String str32 = equipment30.getDescription();
        com.yorku.command.ExtendCommand extendCommand34 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher18, equipment30, (int) '#');
        boolean boolean35 = equipment30.isAvailable();
        equipment30.setAvailable(true);
        equipment30.setLocation("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 20.0d + "'", double19 == 20.0d);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        java.lang.String str7 = labManager1.getPassword();
        labManager1.enableEquipment("hi!");
        labManager1.disableEquipment("hi!");
        java.lang.String str12 = labManager1.getName();
        labManager1.disableEquipment("");
        com.yorku.equipment.Equipment equipment16 = labManager1.getEquipmentById("hi!");
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection17 = labManager1.getAllEquipment();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(equipment16);
        org.junit.Assert.assertNotNull(equipmentCollection17);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        java.util.List<com.yorku.users.User> userList1 = headLabCoordinator0.getPendingApprovals();
        com.yorku.booking.BookingFacade bookingFacade2 = new com.yorku.booking.BookingFacade();
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        com.yorku.booking.BookingFacade bookingFacade59 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user60 = null;
        com.yorku.equipment.Equipment equipment64 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade59.cancelReservation(user60, equipment64);
        com.yorku.equipment.Equipment equipment66 = equipment64.clone();
        bookingFacade2.cancelReservation((com.yorku.users.User) researcher30, equipment64);
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher30);
        com.yorku.users.UserRegistry userRegistry69 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user71 = userRegistry69.getUserByEmail("");
        com.yorku.users.User user73 = userRegistry69.getUserByEmail("");
        headLabCoordinator0.approveUser(user73);
        com.yorku.coordinator.LabManager labManager79 = headLabCoordinator0.generateLabManager("hi!", "", "", "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(equipment66);
        org.junit.Assert.assertNotNull(userRegistry69);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(labManager79);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        com.yorku.equipment.Equipment equipment3 = labManager1.getEquipment("hi!");
        com.yorku.booking.BookingFacade bookingFacade4 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user5 = null;
        com.yorku.equipment.Equipment equipment9 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand11 = new com.yorku.command.ExtendCommand(bookingFacade4, user5, equipment9, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator12 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher16 = new com.yorku.users.Researcher("", "", "hi!");
        double double17 = researcher16.getHourlyRate();
        headLabCoordinator12.approveUser((com.yorku.users.User) researcher16);
        com.yorku.booking.BookingFacade bookingFacade19 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user20 = null;
        com.yorku.equipment.Equipment equipment24 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade19.cancelReservation(user20, equipment24);
        com.yorku.command.ReserveCommand reserveCommand27 = new com.yorku.command.ReserveCommand(bookingFacade4, (com.yorku.users.User) researcher16, equipment24, (int) (byte) 0);
        com.yorku.users.Researcher researcher31 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status32 = null;
        researcher31.setStatus(status32);
        com.yorku.booking.BookingFacade bookingFacade34 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user35 = null;
        com.yorku.equipment.Equipment equipment39 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand41 = new com.yorku.command.ExtendCommand(bookingFacade34, user35, equipment39, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator42 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher46 = new com.yorku.users.Researcher("", "", "hi!");
        double double47 = researcher46.getHourlyRate();
        headLabCoordinator42.approveUser((com.yorku.users.User) researcher46);
        com.yorku.booking.BookingFacade bookingFacade49 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user50 = null;
        com.yorku.equipment.Equipment equipment54 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade49.cancelReservation(user50, equipment54);
        com.yorku.command.ReserveCommand reserveCommand57 = new com.yorku.command.ReserveCommand(bookingFacade34, (com.yorku.users.User) researcher46, equipment54, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand59 = new com.yorku.command.ExtendCommand(bookingFacade4, (com.yorku.users.User) researcher31, equipment54, 0);
        com.yorku.users.User user60 = null;
        com.yorku.booking.BookingFacade bookingFacade61 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator62 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher66 = new com.yorku.users.Researcher("", "", "hi!");
        double double67 = researcher66.getHourlyRate();
        headLabCoordinator62.approveUser((com.yorku.users.User) researcher66);
        com.yorku.users.Researcher researcher72 = new com.yorku.users.Researcher("", "", "hi!");
        double double73 = researcher72.getHourlyRate();
        headLabCoordinator62.approveUser((com.yorku.users.User) researcher72);
        com.yorku.equipment.Equipment equipment78 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str79 = equipment78.getId();
        com.yorku.command.CancelCommand cancelCommand80 = new com.yorku.command.CancelCommand(bookingFacade61, (com.yorku.users.User) researcher72, equipment78);
        java.lang.String str81 = equipment78.getId();
        com.yorku.command.CancelCommand cancelCommand82 = new com.yorku.command.CancelCommand(bookingFacade4, user60, equipment78);
        equipment78.setAvailable(false);
        labManager1.addEquipment(equipment78);
        java.lang.String str86 = equipment78.getDescription();
        equipment78.setLocation("hi!");
        java.lang.String str89 = equipment78.getDescription();
        java.lang.String str90 = equipment78.getId();
        org.junit.Assert.assertNull(equipment3);
        org.junit.Assert.assertNotNull(headLabCoordinator12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator42);
        org.junit.Assert.assertTrue("'" + double47 + "' != '" + 20.0d + "'", double47 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator62);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 20.0d + "'", double67 == 20.0d);
        org.junit.Assert.assertTrue("'" + double73 + "' != '" + 20.0d + "'", double73 == 20.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "" + "'", str86, "");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.UserRegistry userRegistry3 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher7 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status8 = null;
        researcher7.setStatus(status8);
        double double10 = researcher7.getHourlyRate();
        java.lang.String str11 = researcher7.getPassword();
        userRegistry3.registerUser((com.yorku.users.User) researcher7);
        userRegistry0.registerUser((com.yorku.users.User) researcher7);
        java.lang.String str14 = researcher7.getIdNumber();
        double double15 = researcher7.getHourlyRate();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(userRegistry3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 20.0d + "'", double10 == 20.0d);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Student student23 = new com.yorku.users.Student("", "hi!", "hi!");
        java.lang.String str24 = student23.getPassword();
        com.yorku.booking.BookingFacade bookingFacade25 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator26 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        double double31 = researcher30.getHourlyRate();
        headLabCoordinator26.approveUser((com.yorku.users.User) researcher30);
        com.yorku.users.Researcher researcher36 = new com.yorku.users.Researcher("", "", "hi!");
        double double37 = researcher36.getHourlyRate();
        headLabCoordinator26.approveUser((com.yorku.users.User) researcher36);
        com.yorku.equipment.Equipment equipment42 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str43 = equipment42.getId();
        com.yorku.command.CancelCommand cancelCommand44 = new com.yorku.command.CancelCommand(bookingFacade25, (com.yorku.users.User) researcher36, equipment42);
        com.yorku.users.Researcher researcher48 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status49 = null;
        researcher48.setStatus(status49);
        com.yorku.booking.BookingFacade bookingFacade51 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user52 = null;
        com.yorku.equipment.Equipment equipment56 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade51, user52, equipment56, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator59 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher63 = new com.yorku.users.Researcher("", "", "hi!");
        double double64 = researcher63.getHourlyRate();
        headLabCoordinator59.approveUser((com.yorku.users.User) researcher63);
        com.yorku.booking.BookingFacade bookingFacade66 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user67 = null;
        com.yorku.equipment.Equipment equipment71 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade66.cancelReservation(user67, equipment71);
        com.yorku.command.ReserveCommand reserveCommand74 = new com.yorku.command.ReserveCommand(bookingFacade51, (com.yorku.users.User) researcher63, equipment71, (int) (byte) 0);
        bookingFacade25.cancelReservation((com.yorku.users.User) researcher48, equipment71);
        com.yorku.command.CancelCommand cancelCommand76 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student23, equipment71);
        double double77 = student23.getHourlyRate();
        double double78 = student23.getHourlyRate();
        java.lang.String str79 = student23.getIdNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator26);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 20.0d + "'", double31 == 20.0d);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 20.0d + "'", double37 == 20.0d);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator59);
        org.junit.Assert.assertTrue("'" + double64 + "' != '" + 20.0d + "'", double64 == 20.0d);
        org.junit.Assert.assertTrue("'" + double77 + "' != '" + 10.0d + "'", double77 == 10.0d);
        org.junit.Assert.assertTrue("'" + double78 + "' != '" + 10.0d + "'", double78 == 10.0d);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        java.lang.String str7 = equipment5.getLocation();
        boolean boolean8 = equipment5.isAvailable();
        com.yorku.equipment.Equipment equipment9 = equipment5.clone();
        equipment9.setDescription("hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(equipment9);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        java.lang.String str7 = labManager1.getPassword();
        labManager1.enableEquipment("hi!");
        labManager1.disableEquipment("hi!");
        java.lang.String str12 = labManager1.getEmail();
        labManager1.markForMaintenance("");
        com.yorku.equipment.Equipment equipment16 = labManager1.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(equipment16);
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        java.util.List<com.yorku.users.User> userList1 = headLabCoordinator0.getPendingApprovals();
        com.yorku.booking.BookingFacade bookingFacade2 = new com.yorku.booking.BookingFacade();
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        com.yorku.booking.BookingFacade bookingFacade59 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user60 = null;
        com.yorku.equipment.Equipment equipment64 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade59.cancelReservation(user60, equipment64);
        com.yorku.equipment.Equipment equipment66 = equipment64.clone();
        bookingFacade2.cancelReservation((com.yorku.users.User) researcher30, equipment64);
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher30);
        com.yorku.users.UserRegistry userRegistry69 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user71 = userRegistry69.getUserByEmail("");
        com.yorku.users.User user73 = userRegistry69.getUserByEmail("");
        headLabCoordinator0.approveUser(user73);
        java.util.List<com.yorku.users.User> userList75 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.Faculty faculty79 = new com.yorku.users.Faculty("", "hi!", "hi!");
        double double80 = faculty79.getHourlyRate();
        double double81 = faculty79.getHourlyRate();
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty79);
        java.util.List<com.yorku.users.User> userList83 = headLabCoordinator0.getPendingApprovals();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(userList1);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(equipment66);
        org.junit.Assert.assertNotNull(userRegistry69);
        org.junit.Assert.assertNotNull(user71);
        org.junit.Assert.assertNotNull(user73);
        org.junit.Assert.assertNotNull(userList75);
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 15.0d + "'", double80 == 15.0d);
        org.junit.Assert.assertTrue("'" + double81 + "' != '" + 15.0d + "'", double81 == 15.0d);
        org.junit.Assert.assertNotNull(userList83);
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment8 = labManager1.getEquipment("hi!");
        java.lang.String str9 = labManager1.getName();
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList14 = labManager1.getAvailableEquipment();
        java.util.List<com.yorku.equipment.Equipment> equipmentList15 = labManager1.getAvailableEquipment();
        java.util.List<com.yorku.equipment.Equipment> equipmentList16 = labManager1.getAvailableEquipment();
        java.util.List<java.lang.String> strList17 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(equipmentList14);
        org.junit.Assert.assertNotNull(equipmentList15);
        org.junit.Assert.assertNotNull(equipmentList16);
        org.junit.Assert.assertNotNull(strList17);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user14 = null;
        com.yorku.equipment.Equipment equipment18 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade13.cancelReservation(user14, equipment18);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade24 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user25 = null;
        com.yorku.equipment.Equipment equipment29 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade24.cancelReservation(user25, equipment29);
        com.yorku.equipment.Equipment equipment31 = equipment29.clone();
        com.yorku.equipment.Equipment equipment32 = equipment31.clone();
        equipment32.setLocation("");
        com.yorku.command.CancelCommand cancelCommand35 = new com.yorku.command.CancelCommand(bookingFacade13, (com.yorku.users.User) faculty23, equipment32);
        com.yorku.users.UserRegistry userRegistry36 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher40 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status41 = null;
        researcher40.setStatus(status41);
        double double43 = researcher40.getHourlyRate();
        java.lang.String str44 = researcher40.getPassword();
        userRegistry36.registerUser((com.yorku.users.User) researcher40);
        com.yorku.users.User user47 = userRegistry36.getUserByEmail("");
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str52 = equipment51.getLocation();
        equipment51.setAvailable(true);
        bookingFacade13.reserveEquipment(user47, equipment51, (int) ' ');
        com.yorku.command.CancelCommand cancelCommand57 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment51);
        com.yorku.users.Researcher researcher61 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status62 = null;
        researcher61.setStatus(status62);
        com.yorku.users.User.Status status64 = null;
        researcher61.setStatus(status64);
        com.yorku.booking.BookingFacade bookingFacade66 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user67 = null;
        com.yorku.equipment.Equipment equipment71 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade66.cancelReservation(user67, equipment71);
        com.yorku.equipment.Equipment equipment73 = equipment71.clone();
        com.yorku.equipment.Equipment equipment74 = equipment73.clone();
        equipment74.setLocation("");
        com.yorku.equipment.Equipment equipment77 = equipment74.clone();
        java.lang.String str78 = equipment74.getId();
        com.yorku.equipment.Equipment equipment79 = equipment74.clone();
        equipment79.setLocation("hi!");
        com.yorku.command.ExtendCommand extendCommand83 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher61, equipment79, (int) (short) 1);
        com.yorku.users.Guest guest87 = new com.yorku.users.Guest("", "", "hi!");
        boolean boolean88 = guest87.isUniversityAffiliated();
        com.yorku.equipment.Equipment equipment89 = null;
        com.yorku.command.CancelCommand cancelCommand90 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest87, equipment89);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertNotNull(equipment31);
        org.junit.Assert.assertNotNull(equipment32);
        org.junit.Assert.assertNotNull(userRegistry36);
        org.junit.Assert.assertTrue("'" + double43 + "' != '" + 20.0d + "'", double43 == 20.0d);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(user47);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "hi!" + "'", str52, "hi!");
        org.junit.Assert.assertNotNull(equipment73);
        org.junit.Assert.assertNotNull(equipment74);
        org.junit.Assert.assertNotNull(equipment77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
        org.junit.Assert.assertNotNull(equipment79);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.reserve();
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.extend();
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        userRegistry0.registerUser((com.yorku.users.User) researcher30);
        com.yorku.users.User user61 = userRegistry0.getUserByEmail("");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator62 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher66 = new com.yorku.users.Researcher("", "", "hi!");
        double double67 = researcher66.getHourlyRate();
        headLabCoordinator62.approveUser((com.yorku.users.User) researcher66);
        java.lang.String str69 = researcher66.getPassword();
        userRegistry0.registerUser((com.yorku.users.User) researcher66);
        boolean boolean71 = researcher66.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertNotNull(headLabCoordinator62);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 20.0d + "'", double67 == 20.0d);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "" + "'", str69, "");
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        equipmentMonitor1.update("hi!");
        equipmentMonitor1.update("");
        equipmentMonitor1.update("hi!");
        equipmentMonitor1.update("hi!");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        boolean boolean8 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status13 = null;
        researcher12.setStatus(status13);
        com.yorku.users.User.Status status15 = null;
        researcher12.setStatus(status15);
        com.yorku.users.User.Status status17 = researcher12.getStatus();
        userRegistry0.registerUser((com.yorku.users.User) researcher12);
        boolean boolean20 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user22 = userRegistry0.getUserByEmail("");
        com.yorku.users.User user24 = userRegistry0.getUserByEmail("");
        boolean boolean26 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user28 = userRegistry0.getUserByEmail("hi!");
        boolean boolean30 = userRegistry0.isEmailRegistered("");
        boolean boolean32 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user34 = userRegistry0.getUserByEmail("");
        com.yorku.users.Student student38 = new com.yorku.users.Student("hi!", "hi!", "");
        userRegistry0.registerUser((com.yorku.users.User) student38);
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(status17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(user28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(user34);
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        com.yorku.users.Faculty faculty3 = new com.yorku.users.Faculty("", "", "");
        com.yorku.users.User.Status status4 = faculty3.getStatus();
        org.junit.Assert.assertTrue("'" + status4 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status4.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        labManager1.enableEquipment("hi!");
        java.lang.String str14 = labManager1.getName();
        com.yorku.equipment.Equipment equipment16 = labManager1.getEquipment("");
        labManager1.enableEquipment("");
        com.yorku.equipment.Equipment equipment20 = labManager1.getEquipmentById("hi!");
        java.util.List<java.lang.String> strList21 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipment16);
        org.junit.Assert.assertNull(equipment20);
        org.junit.Assert.assertNotNull(strList21);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        boolean boolean8 = userRegistry0.isEmailRegistered("");
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status13 = null;
        researcher12.setStatus(status13);
        com.yorku.users.User.Status status15 = null;
        researcher12.setStatus(status15);
        com.yorku.users.User.Status status17 = researcher12.getStatus();
        userRegistry0.registerUser((com.yorku.users.User) researcher12);
        boolean boolean20 = userRegistry0.isEmailRegistered("hi!");
        com.yorku.users.User user22 = userRegistry0.getUserByEmail("");
        com.yorku.users.User user24 = userRegistry0.getUserByEmail("");
        boolean boolean26 = userRegistry0.isEmailRegistered("hi!");
        boolean boolean28 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user30 = userRegistry0.getUserByEmail("");
        com.yorku.users.Researcher researcher34 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status35 = null;
        researcher34.setStatus(status35);
        boolean boolean37 = researcher34.isUniversityAffiliated();
        double double38 = researcher34.getHourlyRate();
        double double39 = researcher34.getHourlyRate();
        userRegistry0.registerUser((com.yorku.users.User) researcher34);
        boolean boolean42 = userRegistry0.isEmailRegistered("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(status17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(user22);
        org.junit.Assert.assertNotNull(user24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertTrue("'" + double38 + "' != '" + 20.0d + "'", double38 == 20.0d);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.markForMaintenance("");
        labManager1.markForMaintenance("hi!");
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getLocation();
        labManager1.addEquipment(equipment15);
        java.lang.String str18 = equipment15.getLocation();
        equipment15.setAvailable(true);
        java.lang.String str21 = equipment15.getId();
        java.lang.String str22 = equipment15.getId();
        java.lang.String str23 = equipment15.getLocation();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.UserRegistry userRegistry27 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean29 = userRegistry27.isEmailRegistered("");
        com.yorku.users.Researcher researcher33 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status34 = null;
        researcher33.setStatus(status34);
        double double36 = researcher33.getHourlyRate();
        java.lang.String str37 = researcher33.getPassword();
        userRegistry27.registerUser((com.yorku.users.User) researcher33);
        com.yorku.booking.BookingFacade bookingFacade39 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user40 = null;
        com.yorku.equipment.Equipment equipment44 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand46 = new com.yorku.command.ExtendCommand(bookingFacade39, user40, equipment44, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator47 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher51 = new com.yorku.users.Researcher("", "", "hi!");
        double double52 = researcher51.getHourlyRate();
        headLabCoordinator47.approveUser((com.yorku.users.User) researcher51);
        com.yorku.booking.BookingFacade bookingFacade54 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user55 = null;
        com.yorku.equipment.Equipment equipment59 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade54.cancelReservation(user55, equipment59);
        com.yorku.command.ReserveCommand reserveCommand62 = new com.yorku.command.ReserveCommand(bookingFacade39, (com.yorku.users.User) researcher51, equipment59, (int) (byte) 0);
        com.yorku.users.Researcher researcher66 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status67 = null;
        researcher66.setStatus(status67);
        double double69 = researcher66.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade70 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user71 = null;
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade70.cancelReservation(user71, equipment75);
        java.lang.String str77 = equipment75.getLocation();
        boolean boolean78 = equipment75.isAvailable();
        com.yorku.command.ExtendCommand extendCommand80 = new com.yorku.command.ExtendCommand(bookingFacade39, (com.yorku.users.User) researcher66, equipment75, (int) (byte) 100);
        com.yorku.command.ReserveCommand reserveCommand82 = new com.yorku.command.ReserveCommand(bookingFacade26, (com.yorku.users.User) researcher33, equipment75, (int) (byte) -1);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher33);
        com.yorku.users.Student student87 = new com.yorku.users.Student("hi!", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) student87);
        com.yorku.coordinator.LabManager labManager93 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 20.0d + "'", double36 == 20.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(headLabCoordinator47);
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
        org.junit.Assert.assertTrue("'" + double69 + "' != '" + 20.0d + "'", double69 == 20.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(labManager93);
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean24 = faculty23.isUniversityAffiliated();
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str29 = equipment28.getDescription();
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.command.ExtendCommand extendCommand32 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) faculty23, equipment28, (int) (byte) 100);
        java.lang.String str33 = faculty23.getIdNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.users.User user8 = null;
        com.yorku.booking.BookingFacade bookingFacade9 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user10 = null;
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade9.cancelReservation(user10, equipment14);
        com.yorku.users.Faculty faculty19 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade20 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user21 = null;
        com.yorku.equipment.Equipment equipment25 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade20.cancelReservation(user21, equipment25);
        com.yorku.equipment.Equipment equipment27 = equipment25.clone();
        com.yorku.equipment.Equipment equipment28 = equipment27.clone();
        equipment28.setLocation("");
        com.yorku.command.CancelCommand cancelCommand31 = new com.yorku.command.CancelCommand(bookingFacade9, (com.yorku.users.User) faculty19, equipment28);
        com.yorku.users.UserRegistry userRegistry32 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher36 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status37 = null;
        researcher36.setStatus(status37);
        double double39 = researcher36.getHourlyRate();
        java.lang.String str40 = researcher36.getPassword();
        userRegistry32.registerUser((com.yorku.users.User) researcher36);
        com.yorku.users.User user43 = userRegistry32.getUserByEmail("");
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str48 = equipment47.getLocation();
        equipment47.setAvailable(true);
        bookingFacade9.reserveEquipment(user43, equipment47, (int) ' ');
        equipment47.setDescription("hi!");
        bookingFacade0.reserveEquipment(user8, equipment47, (int) '4');
        com.yorku.equipment.Equipment equipment57 = equipment47.clone();
        com.yorku.equipment.Equipment equipment58 = equipment57.clone();
        org.junit.Assert.assertNotNull(equipment27);
        org.junit.Assert.assertNotNull(equipment28);
        org.junit.Assert.assertNotNull(userRegistry32);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(user43);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(equipment57);
        org.junit.Assert.assertNotNull(equipment58);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest7 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment11 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str12 = equipment11.getLocation();
        java.lang.String str13 = equipment11.getDescription();
        java.lang.String str14 = equipment11.getDescription();
        bookingFacade3.cancelReservation((com.yorku.users.User) guest7, equipment11);
        userRegistry0.registerUser((com.yorku.users.User) guest7);
        com.yorku.users.User.Status status17 = null;
        guest7.setStatus(status17);
        double double19 = guest7.getHourlyRate();
        java.lang.String str20 = guest7.getIdNumber();
        com.yorku.users.Student student24 = new com.yorku.users.Student("", "hi!", "hi!");
        java.lang.String str25 = student24.getPassword();
        com.yorku.users.UserRegistry userRegistry26 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean28 = userRegistry26.isEmailRegistered("");
        com.yorku.users.User user30 = userRegistry26.getUserByEmail("hi!");
        com.yorku.users.Faculty faculty34 = new com.yorku.users.Faculty("hi!", "", "hi!");
        userRegistry26.registerUser((com.yorku.users.User) faculty34);
        double double36 = faculty34.getHourlyRate();
        com.yorku.users.User.Status status37 = faculty34.getStatus();
        student24.setStatus(status37);
        guest7.setStatus(status37);
        double double40 = guest7.getHourlyRate();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 30.0d + "'", double19 == 30.0d);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(userRegistry26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(user30);
        org.junit.Assert.assertTrue("'" + double36 + "' != '" + 15.0d + "'", double36 == 15.0d);
        org.junit.Assert.assertTrue("'" + status37 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status37.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 30.0d + "'", double40 == 30.0d);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator7 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator8 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher12 = new com.yorku.users.Researcher("", "", "hi!");
        double double13 = researcher12.getHourlyRate();
        headLabCoordinator8.approveUser((com.yorku.users.User) researcher12);
        java.lang.String str15 = researcher12.getPassword();
        headLabCoordinator7.approveUser((com.yorku.users.User) researcher12);
        com.yorku.coordinator.LabManager labManager18 = new com.yorku.coordinator.LabManager("");
        labManager18.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList21 = labManager18.getAllEquipmentIds();
        com.yorku.booking.BookingFacade bookingFacade22 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user23 = null;
        com.yorku.equipment.Equipment equipment27 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade22.cancelReservation(user23, equipment27);
        com.yorku.equipment.Equipment equipment29 = equipment27.clone();
        equipment29.setAvailable(true);
        labManager18.addEquipment(equipment29);
        com.yorku.command.ExtendCommand extendCommand34 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher12, equipment29, (int) (byte) 100);
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status39 = null;
        researcher38.setStatus(status39);
        boolean boolean41 = researcher38.isUniversityAffiliated();
        double double42 = researcher38.getHourlyRate();
        com.yorku.coordinator.LabManager labManager44 = new com.yorku.coordinator.LabManager("");
        labManager44.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList47 = labManager44.getAllEquipmentIds();
        labManager44.enableEquipment("hi!");
        java.lang.String str50 = labManager44.getName();
        labManager44.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList53 = labManager44.getAvailableEquipment();
        com.yorku.booking.BookingFacade bookingFacade54 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user55 = null;
        com.yorku.equipment.Equipment equipment59 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand61 = new com.yorku.command.ExtendCommand(bookingFacade54, user55, equipment59, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator62 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher66 = new com.yorku.users.Researcher("", "", "hi!");
        double double67 = researcher66.getHourlyRate();
        headLabCoordinator62.approveUser((com.yorku.users.User) researcher66);
        com.yorku.booking.BookingFacade bookingFacade69 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user70 = null;
        com.yorku.equipment.Equipment equipment74 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade69.cancelReservation(user70, equipment74);
        com.yorku.command.ReserveCommand reserveCommand77 = new com.yorku.command.ReserveCommand(bookingFacade54, (com.yorku.users.User) researcher66, equipment74, (int) (byte) 0);
        java.lang.String str78 = equipment74.getDescription();
        com.yorku.equipment.Equipment equipment79 = equipment74.clone();
        labManager44.addEquipment(equipment79);
        com.yorku.equipment.Equipment equipment82 = labManager44.getEquipment("hi!");
        bookingFacade0.extendReservation((com.yorku.users.User) researcher38, equipment82, (int) (short) 10);
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertNotNull(headLabCoordinator8);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 20.0d + "'", double13 == 20.0d);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(equipment29);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertTrue("'" + double42 + "' != '" + 20.0d + "'", double42 == 20.0d);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(equipmentList53);
        org.junit.Assert.assertNotNull(headLabCoordinator62);
        org.junit.Assert.assertTrue("'" + double67 + "' != '" + 20.0d + "'", double67 == 20.0d);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertNotNull(equipment79);
        org.junit.Assert.assertNotNull(equipment82);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.users.Guest guest10 = new com.yorku.users.Guest("", "hi!", "hi!");
        double double11 = guest10.getHourlyRate();
        com.yorku.equipment.Equipment equipment15 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str16 = equipment15.getId();
        com.yorku.command.ExtendCommand extendCommand18 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) guest10, equipment15, (int) (short) -1);
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status23 = null;
        researcher22.setStatus(status23);
        com.yorku.booking.BookingFacade bookingFacade25 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user26 = null;
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade25.cancelReservation(user26, equipment30);
        java.lang.String str32 = equipment30.getLocation();
        equipment30.setAvailable(false);
        com.yorku.command.CancelCommand cancelCommand35 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher22, equipment30);
        equipment30.setLocation("hi!");
        boolean boolean38 = equipment30.isAvailable();
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 30.0d + "'", double11 == 30.0d);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.LabManager labManager22 = headLabCoordinator0.generateLabManager("", "hi!", "hi!", "hi!");
        com.yorku.users.Faculty faculty26 = new com.yorku.users.Faculty("", "hi!", "");
        com.yorku.booking.BookingFacade bookingFacade27 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user28 = null;
        com.yorku.equipment.Equipment equipment32 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand34 = new com.yorku.command.ExtendCommand(bookingFacade27, user28, equipment32, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator35 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher39 = new com.yorku.users.Researcher("", "", "hi!");
        double double40 = researcher39.getHourlyRate();
        headLabCoordinator35.approveUser((com.yorku.users.User) researcher39);
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user43 = null;
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade42.cancelReservation(user43, equipment47);
        com.yorku.command.ReserveCommand reserveCommand50 = new com.yorku.command.ReserveCommand(bookingFacade27, (com.yorku.users.User) researcher39, equipment47, (int) (byte) 0);
        java.lang.String str51 = researcher39.getEmail();
        double double52 = researcher39.getHourlyRate();
        com.yorku.users.User.Status status53 = researcher39.getStatus();
        faculty26.setStatus(status53);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean55 = headLabCoordinator0.registerUser((com.yorku.users.User) faculty26);
            org.junit.Assert.fail("Expected exception of type java.lang.Exception; message: Email already registered");
        } catch (java.lang.Exception e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(labManager22);
        org.junit.Assert.assertNotNull(headLabCoordinator35);
        org.junit.Assert.assertTrue("'" + double40 + "' != '" + 20.0d + "'", double40 == 20.0d);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
        org.junit.Assert.assertTrue("'" + status53 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status53.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
        com.yorku.equipment.Equipment equipment3 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str4 = equipment3.getLocation();
        equipment3.setAvailable(true);
        boolean boolean7 = equipment3.isAvailable();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        com.yorku.equipment.Equipment equipment8 = labManager1.getEquipmentById("");
        com.yorku.equipment.Equipment equipment10 = labManager1.getEquipmentById("");
        java.lang.String str11 = labManager1.getEmail();
        labManager1.enableEquipment("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNull(equipment10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        labManager1.enableEquipment("hi!");
        java.lang.String str14 = labManager1.getName();
        labManager1.disableEquipment("");
        labManager1.disableEquipment("hi!");
        java.lang.String str19 = labManager1.getName();
        java.lang.String str20 = labManager1.getName();
        com.yorku.equipment.Equipment equipment22 = labManager1.getEquipment("");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(equipment22);
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.coordinator.LabManager labManager11 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator12 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher16 = new com.yorku.users.Researcher("", "", "hi!");
        double double17 = researcher16.getHourlyRate();
        headLabCoordinator12.approveUser((com.yorku.users.User) researcher16);
        com.yorku.coordinator.LabManager labManager23 = headLabCoordinator12.generateLabManager("hi!", "", "hi!", "");
        com.yorku.coordinator.LabManager labManager28 = headLabCoordinator12.generateLabManager("", "", "hi!", "");
        com.yorku.users.Researcher researcher32 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status33 = null;
        researcher32.setStatus(status33);
        boolean boolean35 = researcher32.isUniversityAffiliated();
        headLabCoordinator12.approveUser((com.yorku.users.User) researcher32);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher32);
        com.yorku.coordinator.LabManager labManager42 = headLabCoordinator0.generateLabManager("", "hi!", "hi!", "");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator43 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher47 = new com.yorku.users.Researcher("", "", "hi!");
        double double48 = researcher47.getHourlyRate();
        headLabCoordinator43.approveUser((com.yorku.users.User) researcher47);
        com.yorku.users.UserRegistry userRegistry50 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean52 = userRegistry50.isEmailRegistered("");
        com.yorku.users.User user54 = userRegistry50.getUserByEmail("hi!");
        com.yorku.users.User user56 = userRegistry50.getUserByEmail("hi!");
        com.yorku.users.User user58 = userRegistry50.getUserByEmail("hi!");
        com.yorku.users.User user60 = userRegistry50.getUserByEmail("hi!");
        headLabCoordinator43.approveUser(user60);
        com.yorku.coordinator.LabManager labManager66 = headLabCoordinator43.generateLabManager("hi!", "hi!", "", "");
        com.yorku.booking.BookingFacade bookingFacade67 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest71 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str76 = equipment75.getLocation();
        java.lang.String str77 = equipment75.getDescription();
        java.lang.String str78 = equipment75.getDescription();
        bookingFacade67.cancelReservation((com.yorku.users.User) guest71, equipment75);
        double double80 = guest71.getHourlyRate();
        java.lang.String str81 = guest71.getIdNumber();
        double double82 = guest71.getHourlyRate();
        com.yorku.users.User.Status status83 = null;
        guest71.setStatus(status83);
        com.yorku.users.User.Status status85 = guest71.getStatus();
        headLabCoordinator43.rejectUser((com.yorku.users.User) guest71);
        double double87 = guest71.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) guest71);
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNotNull(headLabCoordinator12);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 20.0d + "'", double17 == 20.0d);
        org.junit.Assert.assertNotNull(labManager23);
        org.junit.Assert.assertNotNull(labManager28);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(labManager42);
        org.junit.Assert.assertNotNull(headLabCoordinator43);
        org.junit.Assert.assertTrue("'" + double48 + "' != '" + 20.0d + "'", double48 == 20.0d);
        org.junit.Assert.assertNotNull(userRegistry50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(user54);
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertNotNull(user60);
        org.junit.Assert.assertNotNull(labManager66);
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "" + "'", str78, "");
        org.junit.Assert.assertTrue("'" + double80 + "' != '" + 30.0d + "'", double80 == 30.0d);
        org.junit.Assert.assertEquals("'" + str81 + "' != '" + "hi!" + "'", str81, "hi!");
        org.junit.Assert.assertTrue("'" + double82 + "' != '" + 30.0d + "'", double82 == 30.0d);
        org.junit.Assert.assertNull(status85);
        org.junit.Assert.assertTrue("'" + double87 + "' != '" + 30.0d + "'", double87 == 30.0d);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator4 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher8 = new com.yorku.users.Researcher("", "", "hi!");
        double double9 = researcher8.getHourlyRate();
        headLabCoordinator4.approveUser((com.yorku.users.User) researcher8);
        com.yorku.users.Researcher researcher14 = new com.yorku.users.Researcher("", "", "hi!");
        double double15 = researcher14.getHourlyRate();
        headLabCoordinator4.approveUser((com.yorku.users.User) researcher14);
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str21 = equipment20.getId();
        com.yorku.command.CancelCommand cancelCommand22 = new com.yorku.command.CancelCommand(bookingFacade3, (com.yorku.users.User) researcher14, equipment20);
        com.yorku.users.Researcher researcher26 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status27 = null;
        researcher26.setStatus(status27);
        double double29 = researcher26.getHourlyRate();
        com.yorku.equipment.Equipment equipment33 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str34 = equipment33.getLocation();
        bookingFacade3.reserveEquipment((com.yorku.users.User) researcher26, equipment33, 0);
        userRegistry0.registerUser((com.yorku.users.User) researcher26);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator38 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator39 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher43 = new com.yorku.users.Researcher("", "", "hi!");
        double double44 = researcher43.getHourlyRate();
        headLabCoordinator39.approveUser((com.yorku.users.User) researcher43);
        java.lang.String str46 = researcher43.getPassword();
        headLabCoordinator38.approveUser((com.yorku.users.User) researcher43);
        boolean boolean48 = researcher43.isUniversityAffiliated();
        double double49 = researcher43.getHourlyRate();
        double double50 = researcher43.getHourlyRate();
        com.yorku.users.User.Status status51 = researcher43.getStatus();
        double double52 = researcher43.getHourlyRate();
        userRegistry0.registerUser((com.yorku.users.User) researcher43);
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(headLabCoordinator4);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 20.0d + "'", double9 == 20.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 20.0d + "'", double15 == 20.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + double29 + "' != '" + 20.0d + "'", double29 == 20.0d);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator38);
        org.junit.Assert.assertNotNull(headLabCoordinator39);
        org.junit.Assert.assertTrue("'" + double44 + "' != '" + 20.0d + "'", double44 == 20.0d);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertTrue("'" + double49 + "' != '" + 20.0d + "'", double49 == 20.0d);
        org.junit.Assert.assertTrue("'" + double50 + "' != '" + 20.0d + "'", double50 == 20.0d);
        org.junit.Assert.assertTrue("'" + status51 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status51.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + double52 + "' != '" + 20.0d + "'", double52 == 20.0d);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        com.yorku.equipment.Equipment equipment12 = labManager1.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("", "hi!", "hi!");
        labManager1.addEquipment(equipment16);
        equipment16.setDescription("hi!");
        equipment16.setLocation("hi!");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(equipment12);
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
        com.yorku.equipment.Equipment equipment3 = new com.yorku.equipment.Equipment("hi!", "", "");
        equipment3.setDescription("hi!");
        boolean boolean6 = equipment3.isAvailable();
        equipment3.setAvailable(true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        java.lang.String str18 = faculty16.getIdNumber();
        java.lang.String str19 = faculty16.getEmail();
        double double20 = faculty16.getHourlyRate();
        java.lang.String str21 = faculty16.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 15.0d + "'", double20 == 15.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        java.util.List<com.yorku.users.User> userList18 = headLabCoordinator0.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList19 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.User user20 = null;
        headLabCoordinator0.rejectUser(user20);
        com.yorku.coordinator.LabManager labManager26 = headLabCoordinator0.generateLabManager("", "", "hi!", "hi!");
        com.yorku.coordinator.LabManager labManager31 = headLabCoordinator0.generateLabManager("", "hi!", "hi!", "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(userList18);
        org.junit.Assert.assertNotNull(userList19);
        org.junit.Assert.assertNotNull(labManager26);
        org.junit.Assert.assertNotNull(labManager31);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        equipment5.setAvailable(true);
        java.lang.String str10 = equipment5.getLocation();
        boolean boolean11 = equipment5.isAvailable();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.extend();
        bookingService0.cancel();
        bookingService0.cancel();
        bookingService0.reserve();
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        labManager1.addEquipment(equipment14);
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection16 = labManager1.getAllEquipment();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection17 = labManager1.getAllEquipment();
        com.yorku.equipment.Equipment equipment19 = labManager1.getEquipmentById("");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipmentCollection16);
        org.junit.Assert.assertNotNull(equipmentCollection17);
        org.junit.Assert.assertNull(equipment19);
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        java.lang.String str8 = researcher5.getPassword();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher5);
        com.yorku.coordinator.LabManager labManager14 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        java.util.List<com.yorku.users.User> userList15 = headLabCoordinator0.getPendingApprovals();
        com.yorku.users.UserRegistry userRegistry16 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user18 = userRegistry16.getUserByEmail("");
        com.yorku.booking.BookingFacade bookingFacade19 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator20 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher24 = new com.yorku.users.Researcher("", "", "hi!");
        double double25 = researcher24.getHourlyRate();
        headLabCoordinator20.approveUser((com.yorku.users.User) researcher24);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        double double31 = researcher30.getHourlyRate();
        headLabCoordinator20.approveUser((com.yorku.users.User) researcher30);
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str37 = equipment36.getId();
        com.yorku.command.CancelCommand cancelCommand38 = new com.yorku.command.CancelCommand(bookingFacade19, (com.yorku.users.User) researcher30, equipment36);
        com.yorku.users.Researcher researcher42 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status43 = null;
        researcher42.setStatus(status43);
        double double45 = researcher42.getHourlyRate();
        com.yorku.equipment.Equipment equipment49 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str50 = equipment49.getLocation();
        bookingFacade19.reserveEquipment((com.yorku.users.User) researcher42, equipment49, 0);
        userRegistry16.registerUser((com.yorku.users.User) researcher42);
        java.lang.String str54 = researcher42.getEmail();
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher42);
        com.yorku.coordinator.LabManager labManager60 = headLabCoordinator0.generateLabManager("hi!", "hi!", "", "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertNotNull(userList15);
        org.junit.Assert.assertNotNull(userRegistry16);
        org.junit.Assert.assertNotNull(user18);
        org.junit.Assert.assertNotNull(headLabCoordinator20);
        org.junit.Assert.assertTrue("'" + double25 + "' != '" + 20.0d + "'", double25 == 20.0d);
        org.junit.Assert.assertTrue("'" + double31 + "' != '" + 20.0d + "'", double31 == 20.0d);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + double45 + "' != '" + 20.0d + "'", double45 == 20.0d);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "hi!" + "'", str50, "hi!");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(labManager60);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.reserve();
        bookingService0.cancel();
        bookingService0.cancel();
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getName();
        labManager1.disableEquipment("");
        java.util.List<com.yorku.equipment.Equipment> equipmentList10 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment14 = new com.yorku.equipment.Equipment("hi!", "hi!", "");
        labManager1.addEquipment(equipment14);
        equipment14.setAvailable(true);
        equipment14.setLocation("");
        com.yorku.equipment.Equipment equipment20 = equipment14.clone();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentList10);
        org.junit.Assert.assertNotNull(equipment20);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        java.lang.String str7 = labManager1.getPassword();
        labManager1.enableEquipment("hi!");
        labManager1.disableEquipment("hi!");
        java.lang.String str12 = labManager1.getName();
        labManager1.disableEquipment("");
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user16 = null;
        com.yorku.equipment.Equipment equipment20 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand22 = new com.yorku.command.ExtendCommand(bookingFacade15, user16, equipment20, 0);
        com.yorku.users.User user23 = null;
        com.yorku.booking.BookingFacade bookingFacade24 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user25 = null;
        com.yorku.equipment.Equipment equipment29 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade24.cancelReservation(user25, equipment29);
        com.yorku.users.Faculty faculty34 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade35 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user36 = null;
        com.yorku.equipment.Equipment equipment40 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade35.cancelReservation(user36, equipment40);
        com.yorku.equipment.Equipment equipment42 = equipment40.clone();
        com.yorku.equipment.Equipment equipment43 = equipment42.clone();
        equipment43.setLocation("");
        com.yorku.command.CancelCommand cancelCommand46 = new com.yorku.command.CancelCommand(bookingFacade24, (com.yorku.users.User) faculty34, equipment43);
        com.yorku.users.UserRegistry userRegistry47 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher51 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status52 = null;
        researcher51.setStatus(status52);
        double double54 = researcher51.getHourlyRate();
        java.lang.String str55 = researcher51.getPassword();
        userRegistry47.registerUser((com.yorku.users.User) researcher51);
        com.yorku.users.User user58 = userRegistry47.getUserByEmail("");
        com.yorku.equipment.Equipment equipment62 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str63 = equipment62.getLocation();
        equipment62.setAvailable(true);
        bookingFacade24.reserveEquipment(user58, equipment62, (int) ' ');
        equipment62.setDescription("hi!");
        bookingFacade15.reserveEquipment(user23, equipment62, (int) '4');
        equipment62.setDescription("hi!");
        java.lang.String str74 = equipment62.getDescription();
        java.lang.String str75 = equipment62.getLocation();
        java.lang.String str76 = equipment62.getDescription();
        com.yorku.equipment.Equipment equipment77 = equipment62.clone();
        java.lang.String str78 = equipment77.getLocation();
        labManager1.addEquipment(equipment77);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(equipment42);
        org.junit.Assert.assertNotNull(equipment43);
        org.junit.Assert.assertNotNull(userRegistry47);
        org.junit.Assert.assertTrue("'" + double54 + "' != '" + 20.0d + "'", double54 == 20.0d);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(user58);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "hi!" + "'", str63, "hi!");
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "hi!" + "'", str75, "hi!");
        org.junit.Assert.assertEquals("'" + str76 + "' != '" + "hi!" + "'", str76, "hi!");
        org.junit.Assert.assertNotNull(equipment77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "hi!" + "'", str78, "hi!");
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        java.lang.String str8 = researcher5.getPassword();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher5);
        com.yorku.coordinator.LabManager labManager14 = headLabCoordinator0.generateLabManager("", "hi!", "", "");
        com.yorku.booking.BookingFacade bookingFacade15 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest19 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str24 = equipment23.getLocation();
        java.lang.String str25 = equipment23.getDescription();
        java.lang.String str26 = equipment23.getDescription();
        bookingFacade15.cancelReservation((com.yorku.users.User) guest19, equipment23);
        double double28 = guest19.getHourlyRate();
        java.lang.String str29 = guest19.getIdNumber();
        com.yorku.users.User.Status status30 = null;
        guest19.setStatus(status30);
        double double32 = guest19.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) guest19);
        java.util.List<com.yorku.users.User> userList34 = headLabCoordinator0.getPendingApprovals();
        java.util.List<com.yorku.users.User> userList35 = headLabCoordinator0.getPendingApprovals();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(labManager14);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + double28 + "' != '" + 30.0d + "'", double28 == 30.0d);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 30.0d + "'", double32 == 30.0d);
        org.junit.Assert.assertNotNull(userList34);
        org.junit.Assert.assertNotNull(userList35);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade0.cancelReservation(user1, equipment5);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator7 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator7.approveUser((com.yorku.users.User) researcher11);
        com.yorku.users.Researcher researcher17 = new com.yorku.users.Researcher("", "", "hi!");
        double double18 = researcher17.getHourlyRate();
        headLabCoordinator7.approveUser((com.yorku.users.User) researcher17);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator7.rejectUser((com.yorku.users.User) faculty23);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator25 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher29 = new com.yorku.users.Researcher("", "", "hi!");
        double double30 = researcher29.getHourlyRate();
        headLabCoordinator25.approveUser((com.yorku.users.User) researcher29);
        headLabCoordinator7.rejectUser((com.yorku.users.User) researcher29);
        com.yorku.users.Faculty faculty36 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean37 = faculty36.isUniversityAffiliated();
        headLabCoordinator7.approveUser((com.yorku.users.User) faculty36);
        com.yorku.booking.BookingFacade bookingFacade39 = null;
        com.yorku.users.Researcher researcher43 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status44 = null;
        researcher43.setStatus(status44);
        com.yorku.users.User.Status status46 = null;
        researcher43.setStatus(status46);
        com.yorku.equipment.Equipment equipment51 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment51.setDescription("");
        java.lang.String str54 = equipment51.getDescription();
        equipment51.setAvailable(false);
        com.yorku.command.ReserveCommand reserveCommand58 = new com.yorku.command.ReserveCommand(bookingFacade39, (com.yorku.users.User) researcher43, equipment51, (int) (byte) 100);
        java.lang.String str59 = equipment51.getId();
        com.yorku.command.ReserveCommand reserveCommand61 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) faculty36, equipment51, (int) (byte) 0);
        com.yorku.users.Researcher researcher65 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status66 = null;
        researcher65.setStatus(status66);
        boolean boolean68 = researcher65.isUniversityAffiliated();
        java.lang.String str69 = researcher65.getIdNumber();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator70 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher74 = new com.yorku.users.Researcher("", "", "hi!");
        double double75 = researcher74.getHourlyRate();
        headLabCoordinator70.approveUser((com.yorku.users.User) researcher74);
        java.lang.String str77 = researcher74.getPassword();
        com.yorku.users.User.Status status78 = researcher74.getStatus();
        researcher65.setStatus(status78);
        com.yorku.booking.BookingFacade bookingFacade80 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user81 = null;
        com.yorku.equipment.Equipment equipment85 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade80.cancelReservation(user81, equipment85);
        com.yorku.equipment.Equipment equipment87 = equipment85.clone();
        com.yorku.equipment.Equipment equipment88 = equipment87.clone();
        equipment88.setLocation("");
        com.yorku.equipment.Equipment equipment91 = equipment88.clone();
        java.lang.String str92 = equipment88.getId();
        com.yorku.equipment.Equipment equipment93 = equipment88.clone();
        equipment93.setDescription("");
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher65, equipment93);
        java.lang.String str97 = researcher65.getIdNumber();
        java.lang.String str98 = researcher65.getIdNumber();
        org.junit.Assert.assertNotNull(headLabCoordinator7);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 20.0d + "'", double18 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator25);
        org.junit.Assert.assertTrue("'" + double30 + "' != '" + 20.0d + "'", double30 == 20.0d);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "hi!" + "'", str59, "hi!");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator70);
        org.junit.Assert.assertTrue("'" + double75 + "' != '" + 20.0d + "'", double75 == 20.0d);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "" + "'", str77, "");
        org.junit.Assert.assertTrue("'" + status78 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status78.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertNotNull(equipment87);
        org.junit.Assert.assertNotNull(equipment88);
        org.junit.Assert.assertNotNull(equipment91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "hi!" + "'", str92, "hi!");
        org.junit.Assert.assertNotNull(equipment93);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "hi!" + "'", str97, "hi!");
        org.junit.Assert.assertEquals("'" + str98 + "' != '" + "hi!" + "'", str98, "hi!");
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getEmail();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection8 = labManager1.getAllEquipment();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(equipmentCollection8);
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.coordinator.LabManager labManager11 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        java.lang.String str12 = labManager11.getPassword();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertNotNull(labManager11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.reserve();
        bookingService0.extend();
        bookingService0.cancel();
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        java.lang.String str2 = labManager1.getName();
        labManager1.markForMaintenance("");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
        com.yorku.booking.BookingService bookingService0 = new com.yorku.booking.BookingService();
        bookingService0.cancel();
        bookingService0.extend();
        bookingService0.reserve();
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        java.lang.String str10 = labManager1.getPassword();
        java.lang.String str11 = labManager1.getPassword();
        labManager1.enableEquipment("");
        java.lang.String str14 = labManager1.getName();
        com.yorku.equipment.Equipment equipment16 = labManager1.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment18 = labManager1.getEquipment("hi!");
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(equipment16);
        org.junit.Assert.assertNull(equipment18);
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Faculty faculty23 = new com.yorku.users.Faculty("", "", "hi!");
        boolean boolean24 = faculty23.isUniversityAffiliated();
        com.yorku.equipment.Equipment equipment28 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str29 = equipment28.getDescription();
        com.yorku.equipment.Equipment equipment30 = equipment28.clone();
        com.yorku.command.ExtendCommand extendCommand32 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) faculty23, equipment28, (int) (byte) 100);
        com.yorku.users.Guest guest36 = new com.yorku.users.Guest("hi!", "", "hi!");
        double double37 = guest36.getHourlyRate();
        com.yorku.equipment.Equipment equipment41 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str42 = equipment41.getLocation();
        java.lang.String str43 = equipment41.getDescription();
        com.yorku.equipment.Equipment equipment44 = equipment41.clone();
        equipment41.setDescription("hi!");
        com.yorku.command.ReserveCommand reserveCommand48 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) guest36, equipment41, 0);
        equipment41.setAvailable(true);
        equipment41.setLocation("");
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(equipment30);
        org.junit.Assert.assertTrue("'" + double37 + "' != '" + 30.0d + "'", double37 == 30.0d);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "hi!" + "'", str42, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(equipment44);
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user6 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user8 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.User user10 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade11 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user12 = null;
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand18 = new com.yorku.command.ExtendCommand(bookingFacade11, user12, equipment16, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator19 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        double double24 = researcher23.getHourlyRate();
        headLabCoordinator19.approveUser((com.yorku.users.User) researcher23);
        com.yorku.booking.BookingFacade bookingFacade26 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user27 = null;
        com.yorku.equipment.Equipment equipment31 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade26.cancelReservation(user27, equipment31);
        com.yorku.command.ReserveCommand reserveCommand34 = new com.yorku.command.ReserveCommand(bookingFacade11, (com.yorku.users.User) researcher23, equipment31, (int) (byte) 0);
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status39 = null;
        researcher38.setStatus(status39);
        double double41 = researcher38.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user43 = null;
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade42.cancelReservation(user43, equipment47);
        java.lang.String str49 = equipment47.getLocation();
        boolean boolean50 = equipment47.isAvailable();
        com.yorku.command.ExtendCommand extendCommand52 = new com.yorku.command.ExtendCommand(bookingFacade11, (com.yorku.users.User) researcher38, equipment47, (int) (byte) 100);
        java.lang.String str53 = researcher38.getIdNumber();
        userRegistry0.registerUser((com.yorku.users.User) researcher38);
        com.yorku.users.User user56 = userRegistry0.getUserByEmail("");
        com.yorku.users.User user58 = userRegistry0.getUserByEmail("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertNotNull(user6);
        org.junit.Assert.assertNotNull(user8);
        org.junit.Assert.assertNotNull(user10);
        org.junit.Assert.assertNotNull(headLabCoordinator19);
        org.junit.Assert.assertTrue("'" + double24 + "' != '" + 20.0d + "'", double24 == 20.0d);
        org.junit.Assert.assertTrue("'" + double41 + "' != '" + 20.0d + "'", double41 == 20.0d);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "hi!" + "'", str53, "hi!");
        org.junit.Assert.assertNotNull(user56);
        org.junit.Assert.assertNotNull(user58);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean2 = userRegistry0.isEmailRegistered("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("hi!");
        com.yorku.users.Faculty faculty8 = new com.yorku.users.Faculty("hi!", "", "hi!");
        userRegistry0.registerUser((com.yorku.users.User) faculty8);
        double double10 = faculty8.getHourlyRate();
        com.yorku.users.User.Status status11 = faculty8.getStatus();
        double double12 = faculty8.getHourlyRate();
        double double13 = faculty8.getHourlyRate();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 15.0d + "'", double10 == 15.0d);
        org.junit.Assert.assertTrue("'" + status11 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status11.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 15.0d + "'", double12 == 15.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 15.0d + "'", double13 == 15.0d);
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("");
        com.yorku.users.User user4 = userRegistry0.getUserByEmail("");
        boolean boolean6 = userRegistry0.isEmailRegistered("");
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(user4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.UserRegistry userRegistry20 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean22 = userRegistry20.isEmailRegistered("hi!");
        com.yorku.users.Researcher researcher26 = new com.yorku.users.Researcher("", "", "");
        userRegistry20.registerUser((com.yorku.users.User) researcher26);
        com.yorku.booking.BookingFacade bookingFacade28 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user29 = null;
        com.yorku.equipment.Equipment equipment33 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade28.cancelReservation(user29, equipment33);
        com.yorku.equipment.Equipment equipment35 = equipment33.clone();
        com.yorku.command.ReserveCommand reserveCommand37 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher26, equipment35, (int) 'a');
        com.yorku.booking.BookingFacade bookingFacade38 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user39 = null;
        com.yorku.equipment.Equipment equipment43 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand45 = new com.yorku.command.ExtendCommand(bookingFacade38, user39, equipment43, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator46 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher50 = new com.yorku.users.Researcher("", "", "hi!");
        double double51 = researcher50.getHourlyRate();
        headLabCoordinator46.approveUser((com.yorku.users.User) researcher50);
        com.yorku.booking.BookingFacade bookingFacade53 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user54 = null;
        com.yorku.equipment.Equipment equipment58 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade53.cancelReservation(user54, equipment58);
        com.yorku.command.ReserveCommand reserveCommand61 = new com.yorku.command.ReserveCommand(bookingFacade38, (com.yorku.users.User) researcher50, equipment58, (int) (byte) 0);
        java.lang.String str62 = researcher50.getEmail();
        double double63 = researcher50.getHourlyRate();
        com.yorku.users.User.Status status64 = researcher50.getStatus();
        com.yorku.booking.BookingFacade bookingFacade65 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user66 = null;
        com.yorku.equipment.Equipment equipment70 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade65.cancelReservation(user66, equipment70);
        com.yorku.equipment.Equipment equipment72 = equipment70.clone();
        com.yorku.equipment.Equipment equipment73 = equipment72.clone();
        equipment73.setLocation("");
        com.yorku.equipment.Equipment equipment76 = equipment73.clone();
        java.lang.String str77 = equipment73.getId();
        com.yorku.equipment.Equipment equipment78 = equipment73.clone();
        equipment78.setLocation("hi!");
        com.yorku.command.ExtendCommand extendCommand82 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher50, equipment78, (int) (short) -1);
        java.lang.String str83 = equipment78.getDescription();
        equipment78.setDescription("");
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(userRegistry20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(equipment35);
        org.junit.Assert.assertNotNull(headLabCoordinator46);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 20.0d + "'", double51 == 20.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 20.0d + "'", double63 == 20.0d);
        org.junit.Assert.assertTrue("'" + status64 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status64.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertNotNull(equipment72);
        org.junit.Assert.assertNotNull(equipment73);
        org.junit.Assert.assertNotNull(equipment76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(equipment78);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        com.yorku.booking.BookingFacade bookingFacade0 = null;
        com.yorku.users.UserRegistry userRegistry1 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean3 = userRegistry1.isEmailRegistered("");
        com.yorku.booking.BookingFacade bookingFacade4 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest8 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment12 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str13 = equipment12.getLocation();
        java.lang.String str14 = equipment12.getDescription();
        java.lang.String str15 = equipment12.getDescription();
        bookingFacade4.cancelReservation((com.yorku.users.User) guest8, equipment12);
        userRegistry1.registerUser((com.yorku.users.User) guest8);
        com.yorku.users.User.Status status18 = null;
        guest8.setStatus(status18);
        double double20 = guest8.getHourlyRate();
        java.lang.String str21 = guest8.getIdNumber();
        java.lang.String str22 = guest8.getEmail();
        double double23 = guest8.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade24 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user25 = null;
        com.yorku.equipment.Equipment equipment29 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand31 = new com.yorku.command.ExtendCommand(bookingFacade24, user25, equipment29, 0);
        java.lang.String str32 = equipment29.getLocation();
        java.lang.String str33 = equipment29.getId();
        com.yorku.command.CancelCommand cancelCommand34 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest8, equipment29);
        org.junit.Assert.assertNotNull(userRegistry1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 30.0d + "'", double20 == 30.0d);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 30.0d + "'", double23 == 30.0d);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        labManager1.enableEquipment("hi!");
        java.lang.String str7 = labManager1.getEmail();
        com.yorku.equipment.Equipment equipment9 = labManager1.getEquipmentById("hi!");
        com.yorku.equipment.Equipment equipment11 = labManager1.getEquipment("hi!");
        com.yorku.equipment.Equipment equipment13 = labManager1.getEquipmentById("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(equipment9);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNull(equipment13);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user1 = null;
        com.yorku.equipment.Equipment equipment5 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand7 = new com.yorku.command.ExtendCommand(bookingFacade0, user1, equipment5, 0);
        com.yorku.booking.BookingFacade bookingFacade8 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest12 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment16 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str17 = equipment16.getLocation();
        java.lang.String str18 = equipment16.getDescription();
        java.lang.String str19 = equipment16.getDescription();
        bookingFacade8.cancelReservation((com.yorku.users.User) guest12, equipment16);
        double double21 = guest12.getHourlyRate();
        com.yorku.booking.BookingFacade bookingFacade22 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user23 = null;
        com.yorku.equipment.Equipment equipment27 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand29 = new com.yorku.command.ExtendCommand(bookingFacade22, user23, equipment27, 0);
        com.yorku.users.User user30 = null;
        com.yorku.booking.BookingFacade bookingFacade31 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user32 = null;
        com.yorku.equipment.Equipment equipment36 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade31.cancelReservation(user32, equipment36);
        com.yorku.users.Faculty faculty41 = new com.yorku.users.Faculty("", "", "");
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user43 = null;
        com.yorku.equipment.Equipment equipment47 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade42.cancelReservation(user43, equipment47);
        com.yorku.equipment.Equipment equipment49 = equipment47.clone();
        com.yorku.equipment.Equipment equipment50 = equipment49.clone();
        equipment50.setLocation("");
        com.yorku.command.CancelCommand cancelCommand53 = new com.yorku.command.CancelCommand(bookingFacade31, (com.yorku.users.User) faculty41, equipment50);
        com.yorku.users.UserRegistry userRegistry54 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.Researcher researcher58 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status59 = null;
        researcher58.setStatus(status59);
        double double61 = researcher58.getHourlyRate();
        java.lang.String str62 = researcher58.getPassword();
        userRegistry54.registerUser((com.yorku.users.User) researcher58);
        com.yorku.users.User user65 = userRegistry54.getUserByEmail("");
        com.yorku.equipment.Equipment equipment69 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str70 = equipment69.getLocation();
        equipment69.setAvailable(true);
        bookingFacade31.reserveEquipment(user65, equipment69, (int) ' ');
        equipment69.setDescription("hi!");
        bookingFacade22.reserveEquipment(user30, equipment69, (int) '4');
        com.yorku.equipment.Equipment equipment79 = equipment69.clone();
        com.yorku.command.CancelCommand cancelCommand80 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest12, equipment79);
        cancelCommand80.execute();
        cancelCommand80.execute();
        cancelCommand80.execute();
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + double21 + "' != '" + 30.0d + "'", double21 == 30.0d);
        org.junit.Assert.assertNotNull(equipment49);
        org.junit.Assert.assertNotNull(equipment50);
        org.junit.Assert.assertNotNull(userRegistry54);
        org.junit.Assert.assertTrue("'" + double61 + "' != '" + 20.0d + "'", double61 == 20.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNotNull(user65);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi!" + "'", str70, "hi!");
        org.junit.Assert.assertNotNull(equipment79);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.Researcher researcher23 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status24 = null;
        researcher23.setStatus(status24);
        double double26 = researcher23.getHourlyRate();
        com.yorku.equipment.Equipment equipment30 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str31 = equipment30.getLocation();
        bookingFacade0.reserveEquipment((com.yorku.users.User) researcher23, equipment30, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator34 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher38 = new com.yorku.users.Researcher("", "", "hi!");
        double double39 = researcher38.getHourlyRate();
        headLabCoordinator34.approveUser((com.yorku.users.User) researcher38);
        java.lang.String str41 = researcher38.getPassword();
        com.yorku.booking.BookingFacade bookingFacade42 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest46 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment50 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str51 = equipment50.getLocation();
        java.lang.String str52 = equipment50.getDescription();
        java.lang.String str53 = equipment50.getDescription();
        bookingFacade42.cancelReservation((com.yorku.users.User) guest46, equipment50);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher38, equipment50, (int) (byte) 1);
        com.yorku.booking.BookingFacade bookingFacade57 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest61 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment65 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str66 = equipment65.getLocation();
        java.lang.String str67 = equipment65.getDescription();
        java.lang.String str68 = equipment65.getDescription();
        bookingFacade57.cancelReservation((com.yorku.users.User) guest61, equipment65);
        double double70 = guest61.getHourlyRate();
        java.lang.String str71 = guest61.getIdNumber();
        com.yorku.equipment.Equipment equipment75 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        equipment75.setDescription("");
        com.yorku.command.CancelCommand cancelCommand78 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) guest61, equipment75);
        com.yorku.users.Student student82 = new com.yorku.users.Student("hi!", "", "hi!");
        com.yorku.booking.BookingFacade bookingFacade83 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user84 = null;
        com.yorku.equipment.Equipment equipment88 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade83.cancelReservation(user84, equipment88);
        com.yorku.equipment.Equipment equipment90 = equipment88.clone();
        com.yorku.equipment.Equipment equipment91 = equipment90.clone();
        com.yorku.command.CancelCommand cancelCommand92 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) student82, equipment91);
        cancelCommand92.execute();
        cancelCommand92.execute();
        cancelCommand92.execute();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator34);
        org.junit.Assert.assertTrue("'" + double39 + "' != '" + 20.0d + "'", double39 == 20.0d);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + double70 + "' != '" + 30.0d + "'", double70 == 30.0d);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "hi!" + "'", str71, "hi!");
        org.junit.Assert.assertNotNull(equipment90);
        org.junit.Assert.assertNotNull(equipment91);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        com.yorku.users.Guest guest3 = new com.yorku.users.Guest("", "", "hi!");
        java.lang.String str4 = guest3.getPassword();
        com.yorku.users.User.Status status5 = guest3.getStatus();
        double double6 = guest3.getHourlyRate();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + status5 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status5.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 30.0d + "'", double6 == 30.0d);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        java.lang.String str7 = researcher4.getPassword();
        java.lang.String str8 = researcher4.getEmail();
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        java.util.List<com.yorku.users.User> userList13 = headLabCoordinator0.getPendingApprovals();
        com.yorku.coordinator.LabManager labManager18 = headLabCoordinator0.generateLabManager("", "", "", "hi!");
        com.yorku.coordinator.LabManager labManager23 = headLabCoordinator0.generateLabManager("hi!", "", "hi!", "");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(userList13);
        org.junit.Assert.assertNotNull(labManager18);
        org.junit.Assert.assertNotNull(labManager23);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.lang.String str4 = labManager1.getName();
        java.lang.String str5 = labManager1.getEmail();
        java.util.List<java.lang.String> strList6 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strList6);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.users.Guest guest4 = new com.yorku.users.Guest("", "hi!", "hi!");
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str9 = equipment8.getLocation();
        java.lang.String str10 = equipment8.getDescription();
        java.lang.String str11 = equipment8.getDescription();
        bookingFacade0.cancelReservation((com.yorku.users.User) guest4, equipment8);
        com.yorku.booking.BookingFacade bookingFacade13 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user14 = null;
        com.yorku.equipment.Equipment equipment18 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand20 = new com.yorku.command.ExtendCommand(bookingFacade13, user14, equipment18, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator21 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher25 = new com.yorku.users.Researcher("", "", "hi!");
        double double26 = researcher25.getHourlyRate();
        headLabCoordinator21.approveUser((com.yorku.users.User) researcher25);
        com.yorku.booking.BookingFacade bookingFacade28 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user29 = null;
        com.yorku.equipment.Equipment equipment33 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade28.cancelReservation(user29, equipment33);
        com.yorku.command.ReserveCommand reserveCommand36 = new com.yorku.command.ReserveCommand(bookingFacade13, (com.yorku.users.User) researcher25, equipment33, (int) (byte) 0);
        com.yorku.users.Researcher researcher40 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status41 = null;
        researcher40.setStatus(status41);
        com.yorku.booking.BookingFacade bookingFacade43 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user44 = null;
        com.yorku.equipment.Equipment equipment48 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand50 = new com.yorku.command.ExtendCommand(bookingFacade43, user44, equipment48, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator51 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher55 = new com.yorku.users.Researcher("", "", "hi!");
        double double56 = researcher55.getHourlyRate();
        headLabCoordinator51.approveUser((com.yorku.users.User) researcher55);
        com.yorku.booking.BookingFacade bookingFacade58 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user59 = null;
        com.yorku.equipment.Equipment equipment63 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade58.cancelReservation(user59, equipment63);
        com.yorku.command.ReserveCommand reserveCommand66 = new com.yorku.command.ReserveCommand(bookingFacade43, (com.yorku.users.User) researcher55, equipment63, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand68 = new com.yorku.command.ExtendCommand(bookingFacade13, (com.yorku.users.User) researcher40, equipment63, 0);
        com.yorku.booking.BookingFacade bookingFacade69 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user70 = null;
        com.yorku.equipment.Equipment equipment74 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade69.cancelReservation(user70, equipment74);
        com.yorku.equipment.Equipment equipment76 = equipment74.clone();
        com.yorku.equipment.Equipment equipment77 = equipment76.clone();
        equipment77.setLocation("");
        com.yorku.equipment.Equipment equipment80 = equipment77.clone();
        bookingFacade0.cancelReservation((com.yorku.users.User) researcher40, equipment80);
        com.yorku.users.UserRegistry userRegistry82 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean84 = userRegistry82.isEmailRegistered("");
        com.yorku.users.Researcher researcher88 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status89 = null;
        researcher88.setStatus(status89);
        double double91 = researcher88.getHourlyRate();
        java.lang.String str92 = researcher88.getPassword();
        userRegistry82.registerUser((com.yorku.users.User) researcher88);
        com.yorku.equipment.Equipment equipment94 = null;
        // The following exception was thrown during execution in test generation
        try {
            bookingFacade0.cancelReservation((com.yorku.users.User) researcher88, equipment94);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"com.yorku.equipment.Equipment.getDescription()\" because \"equipment\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(headLabCoordinator21);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator51);
        org.junit.Assert.assertTrue("'" + double56 + "' != '" + 20.0d + "'", double56 == 20.0d);
        org.junit.Assert.assertNotNull(equipment76);
        org.junit.Assert.assertNotNull(equipment77);
        org.junit.Assert.assertNotNull(equipment80);
        org.junit.Assert.assertNotNull(userRegistry82);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertTrue("'" + double91 + "' != '" + 20.0d + "'", double91 == 20.0d);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator0 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher4 = new com.yorku.users.Researcher("", "", "hi!");
        double double5 = researcher4.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher4);
        com.yorku.users.Researcher researcher10 = new com.yorku.users.Researcher("", "", "hi!");
        double double11 = researcher10.getHourlyRate();
        headLabCoordinator0.approveUser((com.yorku.users.User) researcher10);
        com.yorku.users.Faculty faculty16 = new com.yorku.users.Faculty("", "", "");
        headLabCoordinator0.rejectUser((com.yorku.users.User) faculty16);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator18 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher22 = new com.yorku.users.Researcher("", "", "hi!");
        double double23 = researcher22.getHourlyRate();
        headLabCoordinator18.approveUser((com.yorku.users.User) researcher22);
        headLabCoordinator0.rejectUser((com.yorku.users.User) researcher22);
        com.yorku.coordinator.LabManager labManager30 = headLabCoordinator0.generateLabManager("hi!", "", "", "hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList31 = labManager30.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment33 = labManager30.getEquipmentById("hi!");
        org.junit.Assert.assertNotNull(headLabCoordinator0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 20.0d + "'", double5 == 20.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 20.0d + "'", double11 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator18);
        org.junit.Assert.assertTrue("'" + double23 + "' != '" + 20.0d + "'", double23 == 20.0d);
        org.junit.Assert.assertNotNull(labManager30);
        org.junit.Assert.assertNotNull(equipmentList31);
        org.junit.Assert.assertNull(equipment33);
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection5 = labManager1.getAllEquipment();
        com.yorku.equipment.Equipment equipment7 = labManager1.getEquipmentById("");
        java.util.List<java.lang.String> strList8 = labManager1.getAllEquipmentIds();
        java.lang.String str9 = labManager1.getPassword();
        com.yorku.equipment.Equipment equipment11 = labManager1.getEquipmentById("hi!");
        java.lang.String str12 = labManager1.getPassword();
        labManager1.disableEquipment("");
        labManager1.disableEquipment("hi!");
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipmentCollection5);
        org.junit.Assert.assertNull(equipment7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(equipment11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
        com.yorku.booking.BookingFacade bookingFacade0 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator1 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher5 = new com.yorku.users.Researcher("", "", "hi!");
        double double6 = researcher5.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher5);
        com.yorku.users.Researcher researcher11 = new com.yorku.users.Researcher("", "", "hi!");
        double double12 = researcher11.getHourlyRate();
        headLabCoordinator1.approveUser((com.yorku.users.User) researcher11);
        com.yorku.equipment.Equipment equipment17 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str18 = equipment17.getId();
        com.yorku.command.CancelCommand cancelCommand19 = new com.yorku.command.CancelCommand(bookingFacade0, (com.yorku.users.User) researcher11, equipment17);
        com.yorku.users.UserRegistry userRegistry20 = com.yorku.users.UserRegistry.getInstance();
        boolean boolean22 = userRegistry20.isEmailRegistered("hi!");
        com.yorku.users.Researcher researcher26 = new com.yorku.users.Researcher("", "", "");
        userRegistry20.registerUser((com.yorku.users.User) researcher26);
        com.yorku.booking.BookingFacade bookingFacade28 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user29 = null;
        com.yorku.equipment.Equipment equipment33 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade28.cancelReservation(user29, equipment33);
        com.yorku.equipment.Equipment equipment35 = equipment33.clone();
        com.yorku.command.ReserveCommand reserveCommand37 = new com.yorku.command.ReserveCommand(bookingFacade0, (com.yorku.users.User) researcher26, equipment35, (int) 'a');
        com.yorku.booking.BookingFacade bookingFacade38 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user39 = null;
        com.yorku.equipment.Equipment equipment43 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand45 = new com.yorku.command.ExtendCommand(bookingFacade38, user39, equipment43, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator46 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher50 = new com.yorku.users.Researcher("", "", "hi!");
        double double51 = researcher50.getHourlyRate();
        headLabCoordinator46.approveUser((com.yorku.users.User) researcher50);
        com.yorku.booking.BookingFacade bookingFacade53 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user54 = null;
        com.yorku.equipment.Equipment equipment58 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade53.cancelReservation(user54, equipment58);
        com.yorku.command.ReserveCommand reserveCommand61 = new com.yorku.command.ReserveCommand(bookingFacade38, (com.yorku.users.User) researcher50, equipment58, (int) (byte) 0);
        java.lang.String str62 = researcher50.getEmail();
        double double63 = researcher50.getHourlyRate();
        com.yorku.users.User.Status status64 = researcher50.getStatus();
        com.yorku.booking.BookingFacade bookingFacade65 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user66 = null;
        com.yorku.equipment.Equipment equipment70 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade65.cancelReservation(user66, equipment70);
        com.yorku.equipment.Equipment equipment72 = equipment70.clone();
        com.yorku.equipment.Equipment equipment73 = equipment72.clone();
        equipment73.setLocation("");
        com.yorku.equipment.Equipment equipment76 = equipment73.clone();
        java.lang.String str77 = equipment73.getId();
        com.yorku.equipment.Equipment equipment78 = equipment73.clone();
        equipment78.setLocation("hi!");
        com.yorku.command.ExtendCommand extendCommand82 = new com.yorku.command.ExtendCommand(bookingFacade0, (com.yorku.users.User) researcher50, equipment78, (int) (short) -1);
        java.lang.String str83 = equipment78.getDescription();
        java.lang.String str84 = equipment78.getDescription();
        org.junit.Assert.assertNotNull(headLabCoordinator1);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 20.0d + "'", double6 == 20.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 20.0d + "'", double12 == 20.0d);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
        org.junit.Assert.assertNotNull(userRegistry20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(equipment35);
        org.junit.Assert.assertNotNull(headLabCoordinator46);
        org.junit.Assert.assertTrue("'" + double51 + "' != '" + 20.0d + "'", double51 == 20.0d);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + double63 + "' != '" + 20.0d + "'", double63 == 20.0d);
        org.junit.Assert.assertTrue("'" + status64 + "' != '" + com.yorku.users.User.Status.PENDING_APPROVAL + "'", status64.equals(com.yorku.users.User.Status.PENDING_APPROVAL));
        org.junit.Assert.assertNotNull(equipment72);
        org.junit.Assert.assertNotNull(equipment73);
        org.junit.Assert.assertNotNull(equipment76);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "hi!" + "'", str77, "hi!");
        org.junit.Assert.assertNotNull(equipment78);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "" + "'", str83, "");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        java.util.List<java.lang.String> strList4 = labManager1.getAllEquipmentIds();
        java.util.Collection<com.yorku.equipment.Equipment> equipmentCollection5 = labManager1.getAllEquipment();
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        com.yorku.equipment.Equipment equipment8 = labManager1.getEquipmentById("");
        java.util.List<java.lang.String> strList9 = labManager1.getAllEquipmentIds();
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(equipmentCollection5);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNull(equipment8);
        org.junit.Assert.assertNotNull(strList9);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        com.yorku.coordinator.LabManager labManager1 = new com.yorku.coordinator.LabManager("");
        labManager1.markForMaintenance("hi!");
        labManager1.markForMaintenance("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList6 = labManager1.getAvailableEquipment();
        labManager1.disableEquipment("");
        labManager1.enableEquipment("hi!");
        java.util.List<com.yorku.equipment.Equipment> equipmentList11 = labManager1.getAvailableEquipment();
        labManager1.enableEquipment("hi!");
        java.lang.String str14 = labManager1.getName();
        java.util.List<java.lang.String> strList15 = labManager1.getAllEquipmentIds();
        java.util.List<java.lang.String> strList16 = labManager1.getAllEquipmentIds();
        java.lang.String str17 = labManager1.getName();
        labManager1.enableEquipment("");
        com.yorku.booking.BookingFacade bookingFacade20 = new com.yorku.booking.BookingFacade();
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator21 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher25 = new com.yorku.users.Researcher("", "", "hi!");
        double double26 = researcher25.getHourlyRate();
        headLabCoordinator21.approveUser((com.yorku.users.User) researcher25);
        com.yorku.users.Researcher researcher31 = new com.yorku.users.Researcher("", "", "hi!");
        double double32 = researcher31.getHourlyRate();
        headLabCoordinator21.approveUser((com.yorku.users.User) researcher31);
        com.yorku.equipment.Equipment equipment37 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        java.lang.String str38 = equipment37.getId();
        com.yorku.command.CancelCommand cancelCommand39 = new com.yorku.command.CancelCommand(bookingFacade20, (com.yorku.users.User) researcher31, equipment37);
        java.lang.String str40 = equipment37.getId();
        equipment37.setDescription("");
        java.lang.String str43 = equipment37.getDescription();
        equipment37.setLocation("");
        com.yorku.equipment.Equipment equipment46 = equipment37.clone();
        labManager1.addEquipment(equipment37);
        org.junit.Assert.assertNotNull(equipmentList6);
        org.junit.Assert.assertNotNull(equipmentList11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(headLabCoordinator21);
        org.junit.Assert.assertTrue("'" + double26 + "' != '" + 20.0d + "'", double26 == 20.0d);
        org.junit.Assert.assertTrue("'" + double32 + "' != '" + 20.0d + "'", double32 == 20.0d);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
        org.junit.Assert.assertNotNull(equipment46);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        com.yorku.observer.Sensor sensor0 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor1 = new com.yorku.observer.EquipmentMonitor();
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor1);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("hi!");
        sensor0.notifyObservers("");
        sensor0.notifyObservers("");
        com.yorku.observer.Sensor sensor15 = new com.yorku.observer.Sensor();
        com.yorku.observer.EquipmentMonitor equipmentMonitor16 = new com.yorku.observer.EquipmentMonitor();
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor16);
        sensor15.detectUsage("hi!");
        sensor15.detectUsage("hi!");
        com.yorku.observer.EquipmentMonitor equipmentMonitor22 = new com.yorku.observer.EquipmentMonitor();
        sensor15.attach((com.yorku.observer.Observer) equipmentMonitor22);
        equipmentMonitor22.update("");
        equipmentMonitor22.update("hi!");
        sensor0.attach((com.yorku.observer.Observer) equipmentMonitor22);
        sensor0.detectUsage("hi!");
        sensor0.detectUsage("hi!");
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
        com.yorku.users.UserRegistry userRegistry0 = com.yorku.users.UserRegistry.getInstance();
        com.yorku.users.User user2 = userRegistry0.getUserByEmail("hi!");
        com.yorku.booking.BookingFacade bookingFacade3 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user4 = null;
        com.yorku.equipment.Equipment equipment8 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand10 = new com.yorku.command.ExtendCommand(bookingFacade3, user4, equipment8, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator11 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher15 = new com.yorku.users.Researcher("", "", "hi!");
        double double16 = researcher15.getHourlyRate();
        headLabCoordinator11.approveUser((com.yorku.users.User) researcher15);
        com.yorku.booking.BookingFacade bookingFacade18 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user19 = null;
        com.yorku.equipment.Equipment equipment23 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade18.cancelReservation(user19, equipment23);
        com.yorku.command.ReserveCommand reserveCommand26 = new com.yorku.command.ReserveCommand(bookingFacade3, (com.yorku.users.User) researcher15, equipment23, (int) (byte) 0);
        com.yorku.users.Researcher researcher30 = new com.yorku.users.Researcher("", "", "hi!");
        com.yorku.users.User.Status status31 = null;
        researcher30.setStatus(status31);
        com.yorku.booking.BookingFacade bookingFacade33 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user34 = null;
        com.yorku.equipment.Equipment equipment38 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        com.yorku.command.ExtendCommand extendCommand40 = new com.yorku.command.ExtendCommand(bookingFacade33, user34, equipment38, 0);
        com.yorku.coordinator.HeadLabCoordinator headLabCoordinator41 = com.yorku.coordinator.HeadLabCoordinator.getInstance();
        com.yorku.users.Researcher researcher45 = new com.yorku.users.Researcher("", "", "hi!");
        double double46 = researcher45.getHourlyRate();
        headLabCoordinator41.approveUser((com.yorku.users.User) researcher45);
        com.yorku.booking.BookingFacade bookingFacade48 = new com.yorku.booking.BookingFacade();
        com.yorku.users.User user49 = null;
        com.yorku.equipment.Equipment equipment53 = new com.yorku.equipment.Equipment("hi!", "", "hi!");
        bookingFacade48.cancelReservation(user49, equipment53);
        com.yorku.command.ReserveCommand reserveCommand56 = new com.yorku.command.ReserveCommand(bookingFacade33, (com.yorku.users.User) researcher45, equipment53, (int) (byte) 0);
        com.yorku.command.ExtendCommand extendCommand58 = new com.yorku.command.ExtendCommand(bookingFacade3, (com.yorku.users.User) researcher30, equipment53, 0);
        userRegistry0.registerUser((com.yorku.users.User) researcher30);
        com.yorku.users.User user61 = userRegistry0.getUserByEmail("");
        com.yorku.users.User.Status status62 = null;
        user61.setStatus(status62);
        java.lang.String str64 = user61.getIdNumber();
        com.yorku.users.User.Status status65 = user61.getStatus();
        boolean boolean66 = user61.isUniversityAffiliated();
        org.junit.Assert.assertNotNull(userRegistry0);
        org.junit.Assert.assertNotNull(user2);
        org.junit.Assert.assertNotNull(headLabCoordinator11);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 20.0d + "'", double16 == 20.0d);
        org.junit.Assert.assertNotNull(headLabCoordinator41);
        org.junit.Assert.assertTrue("'" + double46 + "' != '" + 20.0d + "'", double46 == 20.0d);
        org.junit.Assert.assertNotNull(user61);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "hi!" + "'", str64, "hi!");
        org.junit.Assert.assertNull(status65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
    }
}
