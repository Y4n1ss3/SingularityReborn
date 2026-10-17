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
public final class EuroSymbolKt {
    private static ImageVector _euroSymbol;

    public static final ImageVector getEuroSymbol(Icons.Rounded rounded) {
        ImageVector imageVector = _euroSymbol;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EuroSymbol", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 18.5f);
        b.curveToRelative(-2.51f, 0.0f, -4.68f, -1.42f, -5.76f, -3.5f);
        b.horizontalLineTo(14.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(8.58f);
        b.curveToRelative(-0.05f, -0.33f, -0.08f, -0.66f, -0.08f, -1.0f);
        b.reflectiveCurveToRelative(0.03f, -0.67f, 0.08f, -1.0f);
        b.horizontalLineTo(14.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineTo(9.24f);
        b.curveTo(10.32f, 6.92f, 12.5f, 5.5f, 15.0f, 5.5f);
        b.curveToRelative(1.25f, 0.0f, 2.42f, 0.36f, 3.42f, 0.97f);
        b.curveToRelative(0.5f, 0.31f, 1.15f, 0.26f, 1.57f, -0.16f);
        b.curveToRelative(0.58f, -0.58f, 0.45f, -1.53f, -0.25f, -1.96f);
        b.curveTo(18.36f, 3.5f, 16.73f, 3.0f, 15.0f, 3.0f);
        b.curveToRelative(-3.92f, 0.0f, -7.24f, 2.51f, -8.48f, 6.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.06f);
        b.curveToRelative(-0.04f, 0.33f, -0.06f, 0.66f, -0.06f, 1.0f);
        b.reflectiveCurveToRelative(0.02f, 0.67f, 0.06f, 1.0f);
        b.horizontalLineTo(4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(2.52f);
        b.curveToRelative(1.24f, 3.49f, 4.56f, 6.0f, 8.48f, 6.0f);
        b.curveToRelative(1.74f, 0.0f, 3.36f, -0.49f, 4.74f, -1.35f);
        b.curveToRelative(0.69f, -0.43f, 0.82f, -1.39f, 0.24f, -1.97f);
        b.curveToRelative(-0.42f, -0.42f, -1.07f, -0.47f, -1.57f, -0.15f);
        b.curveToRelative(-0.99f, 0.62f, -2.15f, 0.97f, -3.41f, 0.97f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _euroSymbol = build;
        build.getClass();
        return build;
    }
}
