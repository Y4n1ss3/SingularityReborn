package androidx.compose.runtime.composer.gapbuffer;

import androidx.compose.runtime.composer.GroupSourceInformation;
import defpackage.q10;
import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GapGroupSourceInformation implements GroupSourceInformation {
    public static final int $stable = 8;
    private boolean closed;
    private int dataEndOffset;
    private final int dataStartOffset;
    private ArrayList<Object> groups;
    private final int key;
    private String sourceInformation;

    public GapGroupSourceInformation(int i, String str, int i2) {
        this.key = i;
        this.sourceInformation = str;
        this.dataStartOffset = i2;
    }

    private final void add(Object obj) {
        ArrayList<Object> groups = getGroups();
        if (groups == null) {
            groups = new ArrayList<>();
        }
        setGroups(groups);
        groups.add(obj);
    }

    private final boolean hasAnchor(GapAnchor gapAnchor) {
        ArrayList<Object> groups = getGroups();
        if (groups != null) {
            int size = groups.size();
            for (int i = 0; i < size; i++) {
                Object obj = groups.get(i);
                if (q10.b(obj, gapAnchor)) {
                    return true;
                }
                if ((obj instanceof GapGroupSourceInformation) && ((GapGroupSourceInformation) obj).hasAnchor(gapAnchor)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final GapGroupSourceInformation openInformation() {
        Object obj;
        GapGroupSourceInformation openInformation;
        ArrayList<Object> groups = getGroups();
        if (groups != null) {
            for (int size = groups.size() - 1; size >= 0; size--) {
                obj = groups.get(size);
                if ((obj instanceof GapGroupSourceInformation) && !((GapGroupSourceInformation) obj).getClosed()) {
                    break;
                }
            }
        }
        obj = null;
        GapGroupSourceInformation gapGroupSourceInformation = obj instanceof GapGroupSourceInformation ? (GapGroupSourceInformation) obj : null;
        return (gapGroupSourceInformation == null || (openInformation = gapGroupSourceInformation.openInformation()) == null) ? this : openInformation;
    }

    public final void addGroupAfter(SlotWriter slotWriter, int i, int i2) {
        GapAnchor tryAnchor$runtime;
        ArrayList<Object> groups = getGroups();
        if (groups == null) {
            groups = new ArrayList<>();
            setGroups(groups);
        }
        int i3 = 0;
        if (i >= 0 && (tryAnchor$runtime = slotWriter.tryAnchor$runtime(i)) != null) {
            int size = groups.size();
            while (true) {
                if (i3 >= size) {
                    i3 = -1;
                    break;
                }
                Object obj = groups.get(i3);
                if (q10.b(obj, tryAnchor$runtime) || ((obj instanceof GapGroupSourceInformation) && ((GapGroupSourceInformation) obj).hasAnchor(tryAnchor$runtime))) {
                    break;
                } else {
                    i3++;
                }
            }
        }
        groups.add(i3, slotWriter.anchor(i2));
    }

    public final void close(int i) {
        setClosed(true);
        setDataEndOffset(i);
    }

    public final void endGrouplessCall(int i) {
        openInformation().close(i);
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public boolean getClosed() {
        return this.closed;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public int getDataEndOffset() {
        return this.dataEndOffset;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public int getDataStartOffset() {
        return this.dataStartOffset;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public ArrayList<Object> getGroups() {
        return this.groups;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public int getKey() {
        return this.key;
    }

    @Override // androidx.compose.runtime.composer.GroupSourceInformation
    public String getSourceInformation() {
        return this.sourceInformation;
    }

    public final boolean removeAnchor(GapAnchor gapAnchor) {
        ArrayList<Object> groups = getGroups();
        if (groups != null) {
            for (int size = groups.size() - 1; size >= 0; size--) {
                Object obj = groups.get(size);
                if (obj instanceof GapAnchor) {
                    if (obj == gapAnchor) {
                        groups.remove(size);
                    }
                } else if ((obj instanceof GapGroupSourceInformation) && !((GapGroupSourceInformation) obj).removeAnchor(gapAnchor)) {
                    groups.remove(size);
                }
            }
            if (groups.isEmpty()) {
                setGroups(null);
                return false;
            }
        }
        return true;
    }

    public final void reportGroup(SlotWriter slotWriter, int i) {
        openInformation().add(slotWriter.anchor(i));
    }

    public void setClosed(boolean z) {
        this.closed = z;
    }

    public void setDataEndOffset(int i) {
        this.dataEndOffset = i;
    }

    public void setGroups(ArrayList<Object> arrayList) {
        this.groups = arrayList;
    }

    public void setSourceInformation(String str) {
        this.sourceInformation = str;
    }

    public final void startGrouplessCall(int i, String str, int i2) {
        openInformation().add(new GapGroupSourceInformation(i, str, i2));
    }

    public final void reportGroup(SlotTable slotTable, int i) {
        openInformation().add(slotTable.anchor(i));
    }
}
