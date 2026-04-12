package com.viswa.patterns.behavioralpatterns.visitor;

public class DeluxeRoom implements IRoom {
    private final String roomNumber;
    private final boolean hasJacuzzi;

    public DeluxeRoom(String roomNumber, boolean hasJacuzzi) {
        this.roomNumber = roomNumber;
        this.hasJacuzzi = hasJacuzzi;
    }

    @Override
    public void accept(IRoomVisitor visitor) {
        visitor.visitDeluxeRoom(this);
    }

    public boolean isHasJacuzzi() {
        return hasJacuzzi;
    }

    public String getRoomNumber() {
        return roomNumber;
    }
}
