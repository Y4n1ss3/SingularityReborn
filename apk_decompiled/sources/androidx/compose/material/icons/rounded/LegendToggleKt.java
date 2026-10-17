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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LegendToggleKt {
    private static ImageVector _legendToggle;

    public static final ImageVector getLegendToggle(Icons.Rounded rounded) {
        ImageVector imageVector = _legendToggle;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LegendToggle", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 15.0f, 5.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(20.0f, 14.55f, 19.55f, 15.0f, 19.0f, 15.0f);
        r6.g(d, 19.0f, 17.0f, 5.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(20.0f, 17.45f, 19.55f, 17.0f, 19.0f, 17.0f);
        k4.x(d, 15.0f, 11.0f, 4.58f, -3.25f);
        d.curveTo(19.84f, 7.56f, 20.0f, 7.26f, 20.0f, 6.94f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.81f, -0.92f, -1.29f, -1.58f, -0.82f);
        d.lineTo(15.0f, 8.55f);
        d.lineTo(10.0f, 5.0f);
        d.lineTo(4.48f, 8.36f);
        d.curveTo(4.18f, 8.55f, 4.0f, 8.87f, 4.0f, 9.22f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, 0.78f, 0.85f, 1.26f, 1.52f, 0.85f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 4.4f, -2.68f, 15.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _legendToggle = build;
        build.getClass();
        return build;
    }
}
