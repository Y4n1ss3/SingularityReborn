package androidx.compose.runtime;

import androidx.compose.runtime.collection.MultiValueMap;
import defpackage.cd0;
import defpackage.fb0;
import defpackage.q10;
import defpackage.xa0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
final class NestedContentMap {
    private final fb0 contentMap = MultiValueMap.m3895constructorimpl$default(null, 1, null);
    private final fb0 containerMap = MultiValueMap.m3895constructorimpl$default(null, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean usedContainer$lambda$0$0(MovableContentStateReference movableContentStateReference, NestedMovableContent nestedMovableContent) {
        return q10.b(nestedMovableContent.getContainer(), movableContentStateReference);
    }

    public final void add(MovableContent<Object> movableContent, NestedMovableContent nestedMovableContent) {
        MultiValueMap.m3891addimpl(this.contentMap, movableContent, nestedMovableContent);
        MultiValueMap.m3891addimpl(this.containerMap, nestedMovableContent.getContainer(), movableContent);
    }

    public final void clear() {
        MultiValueMap.m3893clearimpl(this.contentMap);
        MultiValueMap.m3893clearimpl(this.containerMap);
    }

    public final boolean contains(MovableContent<Object> movableContent) {
        return MultiValueMap.m3896containsimpl(this.contentMap, movableContent);
    }

    public final NestedMovableContent removeLast(MovableContent<Object> movableContent) {
        NestedMovableContent nestedMovableContent = (NestedMovableContent) MultiValueMap.m3906removeLastimpl(this.contentMap, movableContent);
        if (MultiValueMap.m3903isEmptyimpl(this.contentMap)) {
            MultiValueMap.m3893clearimpl(this.containerMap);
        }
        return nestedMovableContent;
    }

    public final void usedContainer(MovableContentStateReference movableContentStateReference) {
        Object d = this.containerMap.d(movableContentStateReference);
        if (d != null) {
            int i = 0;
            if (!(d instanceof xa0)) {
                MultiValueMap.m3907removeValueIfimpl(this.contentMap, (MovableContent) d, new g(movableContentStateReference, i));
                return;
            }
            cd0 cd0Var = (cd0) d;
            Object[] objArr = cd0Var.a;
            int i2 = cd0Var.b;
            for (int i3 = 0; i3 < i2; i3++) {
                Object obj = objArr[i3];
                obj.getClass();
                MultiValueMap.m3907removeValueIfimpl(this.contentMap, (MovableContent) obj, new g(movableContentStateReference, i));
            }
        }
    }
}
