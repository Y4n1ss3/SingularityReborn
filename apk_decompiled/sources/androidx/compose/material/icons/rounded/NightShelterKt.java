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
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NightShelterKt {
    private static ImageVector _nightShelter;

    public static final ImageVector getNightShelter(Icons.Rounded rounded) {
        ImageVector imageVector = _nightShelter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NightShelter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.8f, 3.9f, -6.0f, 4.5f);
        e.curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f);
        e.verticalLineToRelative(9.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(12.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-9.0f);
        e.curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f);
        e.lineToRelative(-6.0f, -4.5f);
        e.curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f);
        e.close();
        e.moveTo(9.75f, 12.5f);
        e.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        e.reflectiveCurveTo(10.44f, 15.0f, 9.75f, 15.0f);
        e.reflectiveCurveTo(8.5f, 14.44f, 8.5f, 13.75f);
        e.reflectiveCurveTo(9.06f, 12.5f, 9.75f, 12.5f);
        k4.r(e, 16.5f, 18.0f, 16.5f, 18.0f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        r6.s(e, -1.0f, 8.0f, 1.0f);
        e.curveTo(8.0f, 17.78f, 7.78f, 18.0f, 7.5f, 18.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(7.22f, 18.0f, 7.0f, 17.78f, 7.0f, 17.5f);
        e.verticalLineToRelative(-6.0f);
        e.curveTo(7.0f, 11.22f, 7.22f, 11.0f, 7.5f, 11.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveTo(7.78f, 11.0f, 8.0f, 11.22f, 8.0f, 11.5f);
        kf0.z(e, 4.0f, 3.5f, -3.0f);
        e.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        e.horizontalLineToRelative(3.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        e.verticalLineToRelative(3.5f);
        e.curveTo(17.0f, 17.78f, 16.78f, 18.0f, 16.5f, 18.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightShelter = build;
        build.getClass();
        return build;
    }
}
