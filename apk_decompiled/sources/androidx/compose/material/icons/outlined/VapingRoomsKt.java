package androidx.compose.material.icons.outlined;

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
import defpackage.bv;
import defpackage.fc;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VapingRoomsKt {
    private static ImageVector _vapingRooms;

    public static final ImageVector getVapingRooms(Icons.Outlined outlined) {
        ImageVector imageVector = _vapingRooms;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.VapingRooms", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(2.0f, 16.5f, 1.0f);
        a.curveToRelative(1.33f, 0.0f, 2.71f, -0.18f, 4.0f, -0.5f);
        a.verticalLineToRelative(3.0f);
        a.curveToRelative(-1.29f, -0.32f, -2.67f, -0.5f, -4.0f, -0.5f);
        bv.s(a, 2.0f, 16.5f, 22.0f, 16.0f);
        a.verticalLineToRelative(3.0f);
        a.horizontalLineTo(8.0f);
        a.verticalLineToRelative(-3.0f);
        a.horizontalLineTo(22.0f);
        a.close();
        a.moveTo(11.0f, 17.5f);
        a.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        a.reflectiveCurveTo(10.0f, 17.22f, 10.0f, 17.5f);
        a.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        a.reflectiveCurveTo(11.0f, 17.78f, 11.0f, 17.5f);
        fc.A(a, 22.0f, 12.76f, 15.0f, -1.5f);
        a.verticalLineToRelative(-2.23f);
        a.curveToRelative(0.0f, -2.24f, -1.76f, -4.07f, -4.0f, -4.07f);
        a.verticalLineTo(7.2f);
        a.curveToRelative(1.02f, 0.0f, 1.85f, -0.83f, 1.85f, -1.85f);
        a.reflectiveCurveTo(17.52f, 3.5f, 16.5f, 3.5f);
        a.verticalLineTo(2.0f);
        a.curveToRelative(1.85f, 0.0f, 3.35f, 1.5f, 3.35f, 3.35f);
        a.curveToRelative(0.0f, 0.93f, -0.38f, 1.77f, -1.0f, 2.38f);
        a.curveTo(20.72f, 8.62f, 22.0f, 10.54f, 22.0f, 12.76f);
        uo.A(a, 19.5f, 13.36f, 15.0f, 18.0f);
        a.verticalLineToRelative(-1.3f);
        a.curveToRelative(0.0f, -1.31f, -0.92f, -2.05f, -1.97f, -2.05f);
        a.horizontalLineTo(14.5f);
        a.curveToRelative(-1.85f, 0.0f, -3.35f, -1.5f, -3.35f, -3.35f);
        a.reflectiveCurveToRelative(1.5f, -3.35f, 3.35f, -3.35f);
        a.verticalLineToRelative(1.5f);
        a.curveToRelative(-1.02f, 0.0f, -1.85f, 0.73f, -1.85f, 1.75f);
        a.reflectiveCurveToRelative(0.83f, 2.0f, 1.85f, 2.0f);
        a.horizontalLineToRelative(1.53f);
        a.curveTo(17.9f, 10.2f, 19.5f, 11.55f, 19.5f, 13.36f);
        a.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _vapingRooms = build;
        build.getClass();
        return build;
    }
}
