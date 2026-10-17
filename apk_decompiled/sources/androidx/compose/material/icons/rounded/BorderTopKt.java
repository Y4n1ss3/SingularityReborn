package androidx.compose.material.icons.rounded;

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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BorderTopKt {
    private static ImageVector _borderTop;

    public static final ImageVector getBorderTop(Icons.Rounded rounded) {
        ImageVector imageVector = _borderTop;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BorderTop", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(7.0f, 21.0f, 2.0f, -2.0f);
        bv.r(b, 7.0f, 19.0f, 2.0f);
        k4.C(b, 7.0f, 13.0f, 2.0f, -2.0f);
        bv.r(b, 7.0f, 11.0f, 2.0f);
        k4.C(b, 11.0f, 13.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 11.0f, 21.0f);
        gy.D(b, 2.0f, -2.0f, -2.0f, 2.0f);
        k4.C(b, 3.0f, 17.0f, 2.0f, -2.0f);
        bv.r(b, 3.0f, 15.0f, 2.0f);
        k4.C(b, 3.0f, 21.0f, 2.0f, -2.0f);
        bv.r(b, 3.0f, 19.0f, 2.0f);
        k4.C(b, 3.0f, 13.0f, 2.0f, -2.0f);
        bv.r(b, 3.0f, 11.0f, 2.0f);
        b.moveTo(3.0f, 9.0f);
        b.horizontalLineToRelative(2.0f);
        b.lineTo(5.0f, 7.0f);
        bv.r(b, 3.0f, 7.0f, 2.0f);
        k4.C(b, 11.0f, 17.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 19.0f, 9.0f);
        uo.n(b, 2.0f, 21.0f, 7.0f, -2.0f);
        bv.m(b, 2.0f, 19.0f, 13.0f, 2.0f);
        r6.p(b, -2.0f, -2.0f, 2.0f);
        b.moveTo(3.0f, 4.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(16.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(4.0f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        r6.B(b, 19.0f, 17.0f, 2.0f, -2.0f);
        fc.x(b, -2.0f, 2.0f, 15.0f, 21.0f);
        gy.D(b, 2.0f, -2.0f, -2.0f, 2.0f);
        b.moveTo(11.0f, 9.0f);
        uo.n(b, 2.0f, 13.0f, 7.0f, -2.0f);
        bv.m(b, 2.0f, 19.0f, 21.0f, 2.0f);
        r6.p(b, -2.0f, -2.0f, 2.0f);
        k4.C(b, 15.0f, 13.0f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(b, -2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _borderTop = build;
        build.getClass();
        return build;
    }
}
