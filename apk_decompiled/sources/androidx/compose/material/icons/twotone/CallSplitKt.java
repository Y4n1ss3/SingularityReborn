package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CallSplitKt {
    private static ImageVector _callSplit;

    public static final ImageVector getCallSplit(Icons.TwoTone twoTone) {
        ImageVector imageVector = _callSplit;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CallSplit", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(20.0f, 4.0f, -6.0f, 2.29f, 2.29f);
        i.lineToRelative(-2.88f, 2.88f);
        i.lineToRelative(1.42f, 1.42f);
        gy.B(i, 2.88f, -2.88f, 20.0f, 10.0f);
        i.moveTo(4.0f, 4.0f);
        i.verticalLineToRelative(6.0f);
        i.lineToRelative(2.29f, -2.29f);
        fc.u(i, 4.71f, 4.7f, 20.0f, 2.0f);
        i.verticalLineToRelative(-8.41f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(i, -5.29f, -5.3f, 10.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _callSplit = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getCallSplit$annotations(Icons.TwoTone twoTone) {
    }
}
