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
import defpackage.j50;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LuggageKt {
    private static ImageVector _luggage;

    public static final ImageVector getLuggage(Icons.Rounded rounded) {
        ImageVector imageVector = _luggage;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Luggage", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = j50.e(17.0f, 6.0f, -2.0f, 3.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-4.0f);
        e.curveTo(9.45f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f);
        e.verticalLineToRelative(3.0f);
        e.horizontalLineTo(7.0f);
        e.curveTo(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f);
        e.verticalLineToRelative(11.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.horizontalLineToRelative(6.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(8.0f);
        e.curveTo(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f);
        k4.r(e, 8.75f, 18.0f, 8.75f, 18.0f);
        e.curveTo(8.34f, 18.0f, 8.0f, 17.66f, 8.0f, 17.25f);
        e.verticalLineToRelative(-7.5f);
        e.curveTo(8.0f, 9.34f, 8.34f, 9.0f, 8.75f, 9.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(9.16f, 9.0f, 9.5f, 9.34f, 9.5f, 9.75f);
        e.verticalLineToRelative(7.5f);
        e.curveTo(9.5f, 17.66f, 9.16f, 18.0f, 8.75f, 18.0f);
        k4.r(e, 12.0f, 18.0f, 12.0f, 18.0f);
        e.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        e.verticalLineToRelative(-7.5f);
        e.curveTo(11.25f, 9.34f, 11.59f, 9.0f, 12.0f, 9.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.41f, 0.0f, 0.75f, 0.34f, 0.75f, 0.75f);
        e.verticalLineToRelative(7.5f);
        e.curveTo(12.75f, 17.66f, 12.41f, 18.0f, 12.0f, 18.0f);
        af0.r(e, 13.5f, 6.0f, -3.0f, 3.5f);
        uo.r(e, 3.0f, 6.0f, 15.25f, 18.0f);
        e.lineTo(15.25f, 18.0f);
        e.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        e.verticalLineToRelative(-7.5f);
        e.curveTo(14.5f, 9.34f, 14.84f, 9.0f, 15.25f, 9.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(15.66f, 9.0f, 16.0f, 9.34f, 16.0f, 9.75f);
        e.verticalLineToRelative(7.5f);
        e.curveTo(16.0f, 17.66f, 15.66f, 18.0f, 15.25f, 18.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _luggage = build;
        build.getClass();
        return build;
    }
}
