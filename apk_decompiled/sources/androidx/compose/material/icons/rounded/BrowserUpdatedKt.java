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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BrowserUpdatedKt {
    private static ImageVector _browserUpdated;

    public static final ImageVector getBrowserUpdated(Icons.Rounded rounded) {
        ImageVector imageVector = _browserUpdated;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.BrowserUpdated", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(15.0f, 3.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(6.0f);
        b.horizontalLineToRelative(1.59f);
        b.curveToRelative(0.89f, 0.0f, 1.34f, 1.08f, 0.71f, 1.71f);
        b.lineToRelative(-2.59f, 2.59f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.lineToRelative(-2.59f, -2.59f);
        b.curveTo(11.08f, 11.08f, 11.52f, 10.0f, 12.41f, 10.0f);
        b.horizontalLineTo(14.0f);
        b.verticalLineTo(4.0f);
        b.curveTo(14.0f, 3.45f, 14.45f, 3.0f, 15.0f, 3.0f);
        b.close();
        b.moveTo(6.0f, 19.59f);
        b.curveTo(6.0f, 20.37f, 6.63f, 21.0f, 7.41f, 21.0f);
        b.horizontalLineToRelative(9.17f);
        b.curveToRelative(0.78f, 0.0f, 1.41f, -0.63f, 1.41f, -1.41f);
        b.curveToRelative(0.0f, -0.72f, -0.44f, -1.03f, -1.0f, -1.59f);
        b.horizontalLineToRelative(3.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        gy.i(b, 2.0f, 4.0f, 5.0f);
        b.lineToRelative(7.0f, 0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(4.0f, 3.0f);
        b.curveTo(2.9f, 3.0f, 2.0f, 3.9f, 2.0f, 5.0f);
        b.verticalLineToRelative(11.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(3.0f);
        b.curveTo(6.45f, 18.55f, 6.0f, 18.87f, 6.0f, 19.59f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _browserUpdated = build;
        build.getClass();
        return build;
    }
}
