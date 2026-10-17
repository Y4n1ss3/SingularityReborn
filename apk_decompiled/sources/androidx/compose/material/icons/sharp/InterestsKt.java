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
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class InterestsKt {
    private static ImageVector _interests;

    public static final ImageVector getInterests(Icons.Sharp sharp) {
        ImageVector imageVector = _interests;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Interests", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.02f, 13.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b.reflectiveCurveTo(9.23f, 13.0f, 7.02f, 13.0f);
        uo.C(b, 13.0f, 13.0f, 8.0f, 8.0f);
        kf0.n(b, -8.0f, 13.0f, 7.0f, 2.0f);
        b.lineToRelative(-5.0f, 9.0f);
        gy.n(b, 10.0f, 7.0f, 2.0f);
        b.moveTo(19.25f, 2.5f);
        b.curveToRelative(-1.06f, 0.0f, -1.81f, 0.56f, -2.25f, 1.17f);
        b.curveToRelative(-0.44f, -0.61f, -1.19f, -1.17f, -2.25f, -1.17f);
        b.curveTo(13.19f, 2.5f, 12.0f, 3.78f, 12.0f, 5.25f);
        b.curveToRelative(0.0f, 2.0f, 2.42f, 3.42f, 5.0f, 5.75f);
        b.curveToRelative(2.58f, -2.33f, 5.0f, -3.75f, 5.0f, -5.75f);
        b.curveTo(22.0f, 3.78f, 20.81f, 2.5f, 19.25f, 2.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _interests = build;
        build.getClass();
        return build;
    }
}
