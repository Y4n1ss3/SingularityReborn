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
import defpackage.j50;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EventRepeatKt {
    private static ImageVector _eventRepeat;

    public static final ImageVector getEventRepeat(Icons.Rounded rounded) {
        ImageVector imageVector = _eventRepeat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EventRepeat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(21.0f, 12.0f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineToRelative(-1.0f);
        d.verticalLineTo(3.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        gy.i(d, 1.0f, 8.0f, 3.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.reflectiveCurveTo(6.0f, 2.45f, 6.0f, 3.0f);
        d.verticalLineToRelative(1.0f);
        d.horizontalLineTo(5.0f);
        d.curveTo(3.9f, 4.0f, 3.0f, 4.9f, 3.0f, 6.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        gy.o(d, 7.0f, -2.0f, 5.0f, 10.0f);
        kp0.j(d, 14.0f, 2.0f, 21.0f);
        d.moveTo(15.13f, 20.0f);
        d.curveToRelative(-0.55f, 0.0f, -0.91f, 0.56f, -0.68f, 1.06f);
        d.curveTo(15.23f, 22.79f, 16.97f, 24.0f, 19.0f, 24.0f);
        d.curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f);
        d.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        d.curveToRelative(-1.36f, 0.0f, -2.6f, 0.55f, -3.5f, 1.43f);
        d.lineToRelative(0.0f, -0.68f);
        d.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        d.horizontalLineToRelative(0.0f);
        d.curveTo(14.34f, 14.0f, 14.0f, 14.34f, 14.0f, 14.75f);
        d.verticalLineTo(17.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(2.25f);
        d.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.41f, -0.34f, -0.75f, -0.75f, -0.75f);
        d.lineToRelative(-0.7f, 0.0f);
        d.curveToRelative(0.63f, -0.62f, 1.5f, -1.0f, 2.45f, -1.0f);
        d.curveToRelative(1.93f, 0.0f, 3.5f, 1.57f, 3.5f, 3.5f);
        d.reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f);
        d.curveToRelative(-1.42f, 0.0f, -2.64f, -0.85f, -3.19f, -2.06f);
        d.curveTo(15.69f, 20.17f, 15.42f, 20.0f, 15.13f, 20.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _eventRepeat = build;
        build.getClass();
        return build;
    }
}
