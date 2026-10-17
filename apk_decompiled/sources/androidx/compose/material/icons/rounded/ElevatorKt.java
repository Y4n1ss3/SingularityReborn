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
import defpackage.bv;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElevatorKt {
    private static ImageVector _elevator;

    public static final ImageVector getElevator(Icons.Rounded rounded) {
        ImageVector imageVector = _elevator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Elevator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        d.close();
        d.moveTo(8.5f, 6.0f);
        d.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        d.curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
        d.reflectiveCurveTo(7.25f, 7.94f, 7.25f, 7.25f);
        d.curveTo(7.25f, 6.56f, 7.81f, 6.0f, 8.5f, 6.0f);
        d.close();
        d.moveTo(11.0f, 13.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.verticalLineToRelative(3.0f);
        d.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        d.horizontalLineTo(8.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-3.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        d.verticalLineToRelative(-1.5f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        d.horizontalLineToRelative(1.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        bv.t(d, 13.0f, 17.52f, 13.76f);
        d.lineToRelative(-1.6f, 2.56f);
        d.curveToRelative(-0.2f, 0.31f, -0.65f, 0.31f, -0.85f, 0.0f);
        d.lineToRelative(-1.6f, -2.56f);
        d.curveTo(13.27f, 13.43f, 13.51f, 13.0f, 13.9f, 13.0f);
        d.horizontalLineToRelative(3.2f);
        d.curveTo(17.49f, 13.0f, 17.73f, 13.43f, 17.52f, 13.76f);
        af0.l(d, 17.1f, 11.0f, -3.2f);
        d.curveToRelative(-0.39f, 0.0f, -0.63f, -0.43f, -0.42f, -0.77f);
        d.lineToRelative(1.6f, -2.56f);
        d.curveToRelative(0.2f, -0.31f, 0.65f, -0.31f, 0.85f, 0.0f);
        d.lineToRelative(1.6f, 2.56f);
        d.curveTo(17.73f, 10.57f, 17.49f, 11.0f, 17.1f, 11.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elevator = build;
        build.getClass();
        return build;
    }
}
