package androidx.compose.runtime.composer.linkbuffer.changelist;

import androidx.compose.runtime.Changes;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ChangeListKt {
    public static final ChangeList asLinkBufferChangeList(Changes changes) {
        ChangeList changeList = changes instanceof ChangeList ? (ChangeList) changes : null;
        if (changeList != null) {
            return changeList;
        }
        throw uf.a("Inconsistent composition");
    }
}
