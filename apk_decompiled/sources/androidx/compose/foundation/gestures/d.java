package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationVector4D;
import defpackage.ky;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements ky {
    public final /* synthetic */ int d;

    public /* synthetic */ d(int i) {
        this.d = i;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        AnimationVector4D _get_convertToVector_$lambda$0;
        AnimationData _get_convertFromVector_$lambda$0;
        w01 invokeSuspend$lambda$0;
        switch (this.d) {
            case 0:
                _get_convertToVector_$lambda$0 = AnimationDataConverter._get_convertToVector_$lambda$0((AnimationData) obj);
                return _get_convertToVector_$lambda$0;
            case 1:
                _get_convertFromVector_$lambda$0 = AnimationDataConverter._get_convertFromVector_$lambda$0((AnimationVector4D) obj);
                return _get_convertFromVector_$lambda$0;
            default:
                invokeSuspend$lambda$0 = MouseWheelScrollingLogic$busyReceive$2$job$1.invokeSuspend$lambda$0(((Long) obj).longValue());
                return invokeSuspend$lambda$0;
        }
    }
}
