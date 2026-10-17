package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.ui.geometry.Offset;
import defpackage.dq;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelectionHandleInfo {
    public static final int $stable = 0;
    private final SelectionHandleAnchor anchor;
    private final Handle handle;
    private final long position;
    private final boolean visible;

    private SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        this.handle = handle;
        this.position = j;
        this.anchor = selectionHandleAnchor;
        this.visible = z;
    }

    /* renamed from: copy-ubNVwUQ$default, reason: not valid java name */
    public static /* synthetic */ SelectionHandleInfo m1502copyubNVwUQ$default(SelectionHandleInfo selectionHandleInfo, Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            handle = selectionHandleInfo.handle;
        }
        if ((i & 2) != 0) {
            j = selectionHandleInfo.position;
        }
        if ((i & 4) != 0) {
            selectionHandleAnchor = selectionHandleInfo.anchor;
        }
        if ((i & 8) != 0) {
            z = selectionHandleInfo.visible;
        }
        return selectionHandleInfo.m1504copyubNVwUQ(handle, j, selectionHandleAnchor, z);
    }

    public final Handle component1() {
        return this.handle;
    }

    /* renamed from: component2-F1C5BW0, reason: not valid java name */
    public final long m1503component2F1C5BW0() {
        return this.position;
    }

    public final SelectionHandleAnchor component3() {
        return this.anchor;
    }

    public final boolean component4() {
        return this.visible;
    }

    /* renamed from: copy-ubNVwUQ, reason: not valid java name */
    public final SelectionHandleInfo m1504copyubNVwUQ(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z) {
        return new SelectionHandleInfo(handle, j, selectionHandleAnchor, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SelectionHandleInfo)) {
            return false;
        }
        SelectionHandleInfo selectionHandleInfo = (SelectionHandleInfo) obj;
        return this.handle == selectionHandleInfo.handle && Offset.m4513equalsimpl0(this.position, selectionHandleInfo.position) && this.anchor == selectionHandleInfo.anchor && this.visible == selectionHandleInfo.visible;
    }

    public final SelectionHandleAnchor getAnchor() {
        return this.anchor;
    }

    public final Handle getHandle() {
        return this.handle;
    }

    /* renamed from: getPosition-F1C5BW0, reason: not valid java name */
    public final long m1505getPositionF1C5BW0() {
        return this.position;
    }

    public final boolean getVisible() {
        return this.visible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.visible) + ((this.anchor.hashCode() + ((Offset.m4518hashCodeimpl(this.position) + (this.handle.hashCode() * 31)) * 31)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SelectionHandleInfo(handle=");
        sb.append(this.handle);
        sb.append(", position=");
        sb.append((Object) Offset.m4524toStringimpl(this.position));
        sb.append(", anchor=");
        sb.append(this.anchor);
        sb.append(", visible=");
        return uf.e(sb, this.visible, ')');
    }

    public /* synthetic */ SelectionHandleInfo(Handle handle, long j, SelectionHandleAnchor selectionHandleAnchor, boolean z, dq dqVar) {
        this(handle, j, selectionHandleAnchor, z);
    }
}
