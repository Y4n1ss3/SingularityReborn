package androidx.compose.material.icons.twotone;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.kp0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NightShelterKt {
    private static ImageVector _nightShelter;

    public static final ImageVector getNightShelter(Icons.TwoTone twoTone) {
        ImageVector imageVector = _nightShelter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.NightShelter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = kp0.e(12.0f, 5.5f, 6.0f, 4.5f, 9.0f);
        e.horizontalLineTo(6.0f);
        e.verticalLineToRelative(-9.0f);
        e.lineTo(12.0f, 5.5f);
        k4.C(e, 15.0f, 12.0f, -3.5f, 3.5f);
        gy.x(e, 8.0f, 11.0f, 7.0f, 7.0f);
        af0.w(e, 1.0f, -1.5f, 8.0f, 18.0f);
        e.horizontalLineToRelative(1.0f);
        e.verticalLineToRelative(-4.0f);
        e.curveTo(17.0f, 12.9f, 16.1f, 12.0f, 15.0f, 12.0f);
        e.close();
        e.moveTo(9.75f, 12.5f);
        e.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        e.curveTo(8.5f, 14.44f, 9.06f, 15.0f, 9.75f, 15.0f);
        e.reflectiveCurveTo(11.0f, 14.44f, 11.0f, 13.75f);
        e.curveTo(11.0f, 13.06f, 10.44f, 12.5f, 9.75f, 12.5f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = kp0.e(12.0f, 5.5f, 6.0f, 4.5f, 9.0f);
        e2.horizontalLineTo(6.0f);
        e2.verticalLineToRelative(-9.0f);
        e2.lineTo(12.0f, 5.5f);
        e2.moveTo(12.0f, 3.0f);
        af0.m(e2, 4.0f, 9.0f, 12.0f, 16.0f);
        e2.verticalLineTo(9.0f);
        r6.C(e2, 12.0f, 3.0f, 12.0f, 3.0f);
        k4.C(e2, 15.0f, 12.0f, -3.5f, 3.5f);
        gy.x(e2, 8.0f, 11.0f, 7.0f, 7.0f);
        af0.w(e2, 1.0f, -1.5f, 8.0f, 18.0f);
        e2.horizontalLineToRelative(1.0f);
        e2.verticalLineToRelative(-4.0f);
        e2.curveTo(17.0f, 12.9f, 16.1f, 12.0f, 15.0f, 12.0f);
        e2.close();
        e2.moveTo(9.75f, 12.5f);
        e2.curveToRelative(-0.69f, 0.0f, -1.25f, 0.56f, -1.25f, 1.25f);
        e2.curveTo(8.5f, 14.44f, 9.06f, 15.0f, 9.75f, 15.0f);
        e2.reflectiveCurveTo(11.0f, 14.44f, 11.0f, 13.75f);
        e2.curveTo(11.0f, 13.06f, 10.44f, 12.5f, 9.75f, 12.5f);
        e2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _nightShelter = build;
        build.getClass();
        return build;
    }
}
