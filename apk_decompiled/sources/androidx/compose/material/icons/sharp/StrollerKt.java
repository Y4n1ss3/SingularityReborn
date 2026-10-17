package androidx.compose.material.icons.sharp;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class StrollerKt {
    private static ImageVector _stroller;

    public static final ImageVector getStroller(Icons.Sharp sharp) {
        ImageVector imageVector = _stroller;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Stroller", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 20.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveTo(18.0f, 18.9f, 18.0f, 20.0f);
        b.close();
        b.moveTo(6.0f, 18.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.reflectiveCurveTo(7.1f, 18.0f, 6.0f, 18.0f);
        bv.g(b, 22.0f, 7.0f, 6.48f);
        b.curveTo(22.0f, 4.56f, 20.52f, 3.0f, 18.65f, 3.0f);
        b.curveToRelative(-1.66f, 0.0f, -2.54f, 1.27f, -3.18f, 2.03f);
        fc.v(b, 5.27f, 17.0f, 17.0f, 6.27f);
        b.curveTo(17.58f, 5.59f, 17.97f, 5.0f, 18.65f, 5.0f);
        b.curveTo(19.42f, 5.0f, 20.0f, 5.66f, 20.0f, 6.48f);
        bv.z(b, 7.0f, 22.0f, 14.3f, 4.1f);
        b.curveTo(13.03f, 3.4f, 11.56f, 3.0f, 10.0f, 3.0f);
        b.curveTo(8.03f, 3.0f, 6.21f, 3.64f, 4.72f, 4.72f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 4.89f, 4.89f, 14.3f, 4.1f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _stroller = build;
        build.getClass();
        return build;
    }
}
