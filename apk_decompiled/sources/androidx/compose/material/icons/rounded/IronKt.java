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
public final class IronKt {
    private static ImageVector _iron;

    public static final ImageVector getIron(Icons.Rounded rounded) {
        ImageVector imageVector = _iron;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Iron", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.27f, 10.0f);
        b.curveToRelative(0.34f, 0.0f, 0.68f, -0.16f, 0.84f, -0.47f);
        b.curveTo(9.28f, 9.22f, 9.62f, 9.0f, 10.0f, 9.0f);
        b.horizontalLineToRelative(4.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        b.verticalLineToRelative(1.0f);
        b.horizontalLineTo(6.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(13.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-1.0f);
        b.curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f);
        b.verticalLineTo(9.0f);
        b.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(0.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.verticalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveTo(8.87f, 7.0f, 7.89f, 7.62f, 7.37f, 8.55f);
        b.curveTo(7.01f, 9.2f, 7.53f, 10.0f, 8.27f, 10.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _iron = build;
        build.getClass();
        return build;
    }
}
