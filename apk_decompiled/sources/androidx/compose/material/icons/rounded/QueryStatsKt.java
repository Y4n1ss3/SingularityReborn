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
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QueryStatsKt {
    private static ImageVector _queryStats;

    public static final ImageVector getQueryStats(Icons.Rounded rounded) {
        ImageVector imageVector = _queryStats;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.QueryStats", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.88f, 18.47f);
        b.curveToRelative(0.48f, -0.77f, 0.75f, -1.67f, 0.69f, -2.66f);
        b.curveToRelative(-0.13f, -2.15f, -1.84f, -3.97f, -3.97f, -4.2f);
        b.curveToRelative(-2.72f, -0.3f, -5.02f, 1.81f, -5.02f, 4.47f);
        b.curveToRelative(0.0f, 2.49f, 2.01f, 4.5f, 4.49f, 4.5f);
        b.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        b.lineToRelative(2.41f, 2.41f);
        b.curveToRelative(0.39f, 0.39f, 1.03f, 0.39f, 1.42f, 0.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.03f, 0.0f, -1.42f);
        uo.l(b, 19.88f, 18.47f, 16.08f, 18.58f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        b.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        b.curveTo(18.58f, 17.46f, 17.46f, 18.58f, 16.08f, 18.58f);
        b.close();
        b.moveTo(15.72f, 10.08f);
        b.curveToRelative(-0.74f, 0.02f, -1.45f, 0.18f, -2.1f, 0.45f);
        b.lineToRelative(-0.55f, -0.83f);
        b.lineToRelative(-3.08f, 5.01f);
        b.curveToRelative(-0.36f, 0.58f, -1.17f, 0.64f, -1.61f, 0.13f);
        b.lineToRelative(-2.12f, -2.47f);
        b.lineToRelative(-3.06f, 4.9f);
        b.curveToRelative(-0.31f, 0.49f, -0.97f, 0.62f, -1.44f, 0.28f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.42f, -0.31f, -0.54f, -0.89f, -0.26f, -1.34f);
        b.lineToRelative(3.78f, -6.05f);
        b.curveToRelative(0.36f, -0.57f, 1.17f, -0.63f, 1.61f, -0.12f);
        b.lineTo(9.0f, 12.5f);
        b.lineToRelative(3.18f, -5.17f);
        b.curveToRelative(0.38f, -0.62f, 1.28f, -0.64f, 1.68f, -0.03f);
        uo.l(b, 15.72f, 10.08f, 18.31f, 10.58f);
        b.curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f);
        b.lineTo(20.8f, 2.9f);
        b.curveToRelative(0.31f, -0.49f, 0.97f, -0.61f, 1.43f, -0.27f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.43f, 0.31f, 0.54f, 0.9f, 0.26f, 1.34f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 18.31f, 10.58f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queryStats = build;
        build.getClass();
        return build;
    }
}
