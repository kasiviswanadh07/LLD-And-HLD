package com.viswa.patterns.behavioralpatterns.visitor;

public interface IRoom {
    void accept(IRoomVisitor visitor);
}
