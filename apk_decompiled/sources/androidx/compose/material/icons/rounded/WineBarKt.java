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
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WineBarKt {
    private static ImageVector _wineBar;

    public static final ImageVector getWineBar(Icons.Rounded rounded) {
        ImageVector imageVector = _wineBar;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.WineBar", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.0f, 3.0f);
        b.curveTo(6.45f, 3.0f, 6.0f, 3.45f, 6.0f, 4.0f);
        b.lineToRelative(0.0f, 5.0f);
        b.curveToRelative(0.0f, 2.97f, 2.16f, 5.43f, 5.0f, 5.91f);
        b.verticalLineTo(19.0f);
        b.horizontalLineTo(9.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(6.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-2.0f);
        b.verticalLineToRelative(-4.09f);
        b.curveToRelative(2.84f, -0.48f, 5.0f, -2.94f, 5.0f, -5.91f);
        b.lineToRelative(0.0f, -5.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        kp0.B(b, 7.0f, 16.0f, 8.0f, 8.0f);
        b.lineToRelative(0.0f, -3.0f);
        b.horizontalLineToRelative(8.0f);
        b.curveTo(16.0f, 5.0f, 16.0f, 8.0f, 16.0f, 8.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wineBar = build;
        build.getClass();
        return build;
    }
}
