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
import defpackage.bv;
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LeakAddKt {
    private static ImageVector _leakAdd;

    public static final ImageVector getLeakAdd(Icons.TwoTone twoTone) {
        ImageVector imageVector = _leakAdd;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LeakAdd", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(18.0f, 21.0f, 3.0f, -3.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.close();
        b.moveTo(3.0f, 14.0f);
        b.curveToRelative(6.08f, 0.0f, 11.0f, -4.93f, 11.0f, -11.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, 4.97f, -4.03f, 9.0f, -9.0f, 9.0f);
        bv.m(b, 2.0f, 14.0f, 21.0f, 2.0f);
        b.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, 3.13f, -7.0f, 7.0f);
        b.close();
        b.moveTo(3.0f, 10.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, -3.13f, 7.0f, -7.0f);
        b.lineTo(8.0f, 3.0f);
        b.curveToRelative(0.0f, 2.76f, -2.24f, 5.0f, -5.0f, 5.0f);
        bv.m(b, 2.0f, 10.0f, 21.0f, 2.0f);
        b.curveToRelative(0.0f, -4.97f, 4.03f, -9.0f, 9.0f, -9.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(-6.07f, 0.0f, -11.0f, 4.93f, -11.0f, 11.0f);
        bv.v(b, 3.0f, 3.0f, 3.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 3.0f, 3.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakAdd = build;
        build.getClass();
        return build;
    }
}
