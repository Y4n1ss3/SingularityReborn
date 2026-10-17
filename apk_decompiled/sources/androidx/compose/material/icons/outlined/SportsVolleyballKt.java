package androidx.compose.material.icons.outlined;

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
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsVolleyballKt {
    private static ImageVector _sportsVolleyball;

    public static final ImageVector getSportsVolleyball(Icons.Outlined outlined) {
        ImageVector imageVector = _sportsVolleyball;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SportsVolleyball", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        b.curveTo(22.0f, 6.48f, 17.52f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(13.0f, 4.07f);
        b.curveToRelative(3.07f, 0.38f, 5.57f, 2.52f, 6.54f, 5.36f);
        uf.o(b, 13.0f, 5.65f, 4.07f);
        b.moveTo(8.0f, 5.08f);
        b.curveToRelative(1.18f, -0.69f, 3.33f, -1.06f, 3.0f, -1.02f);
        uo.z(b, 7.35f, -3.0f, 1.73f, 5.08f);
        b.moveTo(4.63f, 15.1f);
        b.curveTo(4.23f, 14.14f, 4.0f, 13.1f, 4.0f, 12.0f);
        b.curveToRelative(0.0f, -2.02f, 0.76f, -3.86f, 2.0f, -5.27f);
        kf0.t(b, 7.58f, 4.63f, 15.1f);
        b.moveTo(5.64f, 16.83f);
        b.lineTo(12.0f, 13.15f);
        b.lineToRelative(3.0f, 1.73f);
        b.lineToRelative(-6.98f, 4.03f);
        b.curveTo(7.09f, 18.38f, 6.28f, 17.68f, 5.64f, 16.83f);
        b.close();
        b.moveTo(10.42f, 19.84f);
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-0.54f, 0.0f, -1.07f, -0.06f, -1.58f, -0.16f);
        b.lineToRelative(6.58f, -3.8f);
        b.lineToRelative(1.36f, 0.78f);
        b.curveTo(16.9f, 18.75f, 14.6f, 20.0f, 12.0f, 20.0f);
        bv.g(b, 13.0f, 11.42f, 7.96f);
        b.lineToRelative(7.0f, 4.05f);
        b.curveToRelative(0.0f, 1.1f, -0.23f, 2.14f, -0.63f, 3.09f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 13.0f, 11.42f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sportsVolleyball = build;
        build.getClass();
        return build;
    }
}
