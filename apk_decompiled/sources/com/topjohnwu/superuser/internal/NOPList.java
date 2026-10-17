package com.topjohnwu.superuser.internal;

import java.util.AbstractList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class NOPList extends AbstractList<String> {
    private static NOPList list;

    private NOPList() {
    }

    public static NOPList getInstance() {
        NOPList nOPList = list;
        if (nOPList != null) {
            return nOPList;
        }
        NOPList nOPList2 = new NOPList();
        list = nOPList2;
        return nOPList2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return null;
    }
}
