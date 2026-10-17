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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TableBarKt {
    private static ImageVector _tableBar;

    public static final ImageVector getTableBar(Icons.Rounded rounded) {
        ImageVector imageVector = _tableBar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.TableBar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.0f, 7.5f);
        b.curveTo(22.0f, 5.57f, 17.52f, 4.0f, 12.0f, 4.0f);
        b.reflectiveCurveTo(2.0f, 5.57f, 2.0f, 7.5f);
        b.curveToRelative(0.0f, 1.81f, 3.95f, 3.31f, 9.0f, 3.48f);
        b.verticalLineTo(15.0f);
        b.horizontalLineTo(9.35f);
        b.curveToRelative(-0.82f, 0.0f, -1.55f, 0.5f, -1.86f, 1.26f);
        b.lineToRelative(-0.99f, 2.47f);
        b.curveTo(6.27f, 19.34f, 6.71f, 20.0f, 7.37f, 20.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.38f, 0.0f, 0.72f, -0.23f, 0.86f, -0.58f);
        b.lineTo(9.2f, 17.0f);
        b.horizontalLineToRelative(5.6f);
        b.lineToRelative(0.97f, 2.42f);
        b.curveToRelative(0.14f, 0.35f, 0.48f, 0.58f, 0.86f, 0.58f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.66f, 0.0f, 1.11f, -0.66f, 0.86f, -1.27f);
        b.lineToRelative(-0.99f, -2.47f);
        b.curveTo(16.2f, 15.5f, 15.46f, 15.0f, 14.65f, 15.0f);
        b.horizontalLineTo(13.0f);
        b.verticalLineToRelative(-4.02f);
        b.curveTo(18.05f, 10.81f, 22.0f, 9.31f, 22.0f, 7.5f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _tableBar = build;
        build.getClass();
        return build;
    }
}
