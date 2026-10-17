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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FlatwareKt {
    private static ImageVector _flatware;

    public static final ImageVector getFlatware(Icons.Rounded rounded) {
        ImageVector imageVector = _flatware;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Flatware", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(16.0f, 7.08f);
        b.curveToRelative(0.0f, 1.77f, -0.84f, 3.25f, -2.0f, 3.82f);
        b.verticalLineTo(20.0f);
        b.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        b.verticalLineToRelative(-9.1f);
        b.curveToRelative(-1.16f, -0.57f, -2.0f, -2.05f, -2.0f, -3.82f);
        b.curveTo(10.01f, 4.83f, 11.35f, 3.0f, 13.0f, 3.0f);
        b.curveTo(14.66f, 3.0f, 16.0f, 4.83f, 16.0f, 7.08f);
        b.close();
        b.moveTo(18.27f, 3.18f);
        b.curveTo(17.64f, 2.99f, 17.0f, 3.49f, 17.0f, 4.15f);
        b.lineTo(17.0f, 20.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-7.0f);
        b.horizontalLineToRelative(1.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineTo(7.0f);
        b.curveTo(21.0f, 5.54f, 20.14f, 3.74f, 18.27f, 3.18f);
        b.close();
        b.moveTo(8.28f, 3.0f);
        b.curveToRelative(-0.4f, 0.0f, -0.72f, 0.32f, -0.72f, 0.72f);
        uo.j(b, 7.0f, 6.72f, 3.72f);
        b.curveTo(6.72f, 3.32f, 6.4f, 3.0f, 6.0f, 3.0f);
        b.reflectiveCurveTo(5.28f, 3.32f, 5.28f, 3.72f);
        uo.j(b, 7.0f, 4.44f, 3.72f);
        b.curveTo(4.44f, 3.32f, 4.12f, 3.0f, 3.72f, 3.0f);
        b.reflectiveCurveTo(3.0f, 3.32f, 3.0f, 3.72f);
        b.verticalLineTo(9.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.verticalLineToRelative(9.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(0.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-9.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(3.72f);
        b.curveTo(9.0f, 3.32f, 8.68f, 3.0f, 8.28f, 3.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flatware = build;
        build.getClass();
        return build;
    }
}
