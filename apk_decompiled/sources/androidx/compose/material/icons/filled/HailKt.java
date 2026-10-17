package androidx.compose.material.icons.filled;

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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HailKt {
    private static ImageVector _hail;

    public static final ImageVector getHail(Icons.Filled filled) {
        ImageVector imageVector = _hail;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Hail", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        r6.B(b, 17.0f, 2.0f, 2.0f, 0.4f);
        b.curveToRelative(-0.1f, 2.2f, -0.8f, 3.9f, -2.3f, 5.1f);
        b.curveToRelative(-0.5f, 0.4f, -1.1f, 0.7f, -1.7f, 0.9f);
        fc.w(b, 15.0f, 22.0f, -2.0f, -6.0f);
        bv.C(b, -2.0f, 6.0f, 9.0f, 22.0f);
        b.lineTo(9.0f, 10.1f);
        b.curveToRelative(-0.3f, 0.1f, -0.5f, 0.2f, -0.6f, 0.3f);
        b.curveToRelative(-0.9f, 0.7f, -1.39f, 1.6f, -1.4f, 3.1f);
        bv.q(b, 0.5f, 5.0f, 14.0f, -0.5f);
        b.curveToRelative(0.0f, -2.0f, 0.71f, -3.59f, 2.11f, -4.79f);
        b.curveTo(8.21f, 7.81f, 10.0f, 7.0f, 12.0f, 7.0f);
        b.reflectiveCurveToRelative(2.68f, -0.46f, 3.48f, -1.06f);
        b.curveTo(16.48f, 5.14f, 17.0f, 4.0f, 17.0f, 2.5f);
        uo.l(b, 17.0f, 2.0f, 4.0f, 16.0f);
        bv.C(b, 3.0f, 6.0f, 4.0f, 22.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, -6.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hail = build;
        build.getClass();
        return build;
    }
}
