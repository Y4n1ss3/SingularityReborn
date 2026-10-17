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
import defpackage.af0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class QueryBuilderKt {
    private static ImageVector _queryBuilder;

    public static final ImageVector getQueryBuilder(Icons.Rounded rounded) {
        ImageVector imageVector = _queryBuilder;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.QueryBuilder", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.99f, 2.0f);
        b.curveTo(6.47f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        b.reflectiveCurveToRelative(4.47f, 10.0f, 9.99f, 10.0f);
        b.curveTo(17.52f, 22.0f, 22.0f, 17.52f, 22.0f, 12.0f);
        b.reflectiveCurveTo(17.52f, 2.0f, 11.99f, 2.0f);
        b.close();
        b.moveTo(12.0f, 20.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, -3.58f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(3.58f, -8.0f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f);
        b.reflectiveCurveToRelative(-3.58f, 8.0f, -8.0f, 8.0f);
        af0.l(b, 11.78f, 7.0f, -0.06f);
        b.curveToRelative(-0.4f, 0.0f, -0.72f, 0.32f, -0.72f, 0.72f);
        b.verticalLineToRelative(4.72f);
        b.curveToRelative(0.0f, 0.35f, 0.18f, 0.68f, 0.49f, 0.86f);
        b.lineToRelative(4.15f, 2.49f);
        b.curveToRelative(0.34f, 0.2f, 0.78f, 0.1f, 0.98f, -0.24f);
        b.curveToRelative(0.21f, -0.34f, 0.1f, -0.79f, -0.25f, -0.99f);
        b.lineToRelative(-3.87f, -2.3f);
        b.lineTo(12.5f, 7.72f);
        b.curveToRelative(0.0f, -0.4f, -0.32f, -0.72f, -0.72f, -0.72f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _queryBuilder = build;
        build.getClass();
        return build;
    }
}
