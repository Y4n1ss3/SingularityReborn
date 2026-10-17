package androidx.compose.ui.viewinterop;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.f30;
import defpackage.my;
import defpackage.o;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class AndroidView_androidKt$updateViewHolderParams$5 extends f30 implements my {
    public static final AndroidView_androidKt$updateViewHolderParams$5 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$5();

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidView_androidKt$updateViewHolderParams$5() {
        super(2);
    }

    public final void invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        int i = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            o.n();
            return;
        }
        requireViewFactoryHolder.setLayoutDirection(i2);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LayoutDirection) obj2);
        return w01.a;
    }
}
