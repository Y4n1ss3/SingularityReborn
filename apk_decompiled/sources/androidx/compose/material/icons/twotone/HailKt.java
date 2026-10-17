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
import defpackage.af0;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HailKt {
    private static ImageVector _hail;

    public static final ImageVector getHail(Icons.TwoTone twoTone) {
        ImageVector imageVector = _hail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Hail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveTo(13.1f, 6.0f, 12.0f, 6.0f);
        af0.l(b, 17.0f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 2.7f, -0.93f, 4.41f, -2.3f, 5.5f);
        b.curveToRelative(-0.5f, 0.4f, -1.1f, 0.7f, -1.7f, 0.9f);
        uf.p(b, 22.0f, -2.0f, -6.0f, -2.0f);
        gy.i(b, 6.0f, 9.0f, 10.1f);
        b.curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f);
        b.curveTo(7.87f, 10.81f, 7.0f, 11.43f, 7.0f, 14.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(0.0f, -2.06f, 0.35f, -3.78f, 2.11f, -5.29f);
        b.curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f);
        b.reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f);
        b.curveTo(15.96f, 5.55f, 17.0f, 4.76f, 17.0f, 2.0f);
        r6.B(b, 4.0f, 16.0f, 3.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.o(b, 4.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hail = build;
        build.getClass();
        return build;
    }
}
