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
import defpackage.af0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QueryStatsKt {
    private static ImageVector _queryStats;

    public static final ImageVector getQueryStats(Icons.Filled filled) {
        ImageVector imageVector = _queryStats;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.QueryStats", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.88f, 18.47f);
        b.curveToRelative(0.44f, -0.7f, 0.7f, -1.51f, 0.7f, -2.39f);
        b.curveToRelative(0.0f, -2.49f, -2.01f, -4.5f, -4.5f, -4.5f);
        b.reflectiveCurveToRelative(-4.5f, 2.01f, -4.5f, 4.5f);
        b.reflectiveCurveToRelative(2.01f, 4.5f, 4.49f, 4.5f);
        b.curveToRelative(0.88f, 0.0f, 1.7f, -0.26f, 2.39f, -0.7f);
        b.lineTo(21.58f, 23.0f);
        r6.C(b, 23.0f, 21.58f, 19.88f, 18.47f);
        b.moveTo(16.08f, 18.58f);
        b.curveToRelative(-1.38f, 0.0f, -2.5f, -1.12f, -2.5f, -2.5f);
        b.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        b.reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f);
        b.curveTo(18.58f, 17.46f, 17.46f, 18.58f, 16.08f, 18.58f);
        b.close();
        b.moveTo(15.72f, 10.08f);
        b.curveToRelative(-0.74f, 0.02f, -1.45f, 0.18f, -2.1f, 0.45f);
        b.lineToRelative(-0.55f, -0.83f);
        b.lineToRelative(-3.8f, 6.18f);
        b.lineToRelative(-3.01f, -3.52f);
        b.lineToRelative(-3.63f, 5.81f);
        b.lineTo(1.0f, 17.0f);
        b.lineToRelative(5.0f, -8.0f);
        b.lineToRelative(3.0f, 3.5f);
        b.lineTo(13.0f, 6.0f);
        b.curveTo(13.0f, 6.0f, 15.72f, 10.08f, 15.72f, 10.08f);
        b.close();
        b.moveTo(18.31f, 10.58f);
        b.curveToRelative(-0.64f, -0.28f, -1.33f, -0.45f, -2.05f, -0.49f);
        b.curveToRelative(0.0f, 0.0f, 5.12f, -8.09f, 5.12f, -8.09f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 23.0f, 3.18f, 18.31f, 10.58f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queryStats = build;
        build.getClass();
        return build;
    }
}
