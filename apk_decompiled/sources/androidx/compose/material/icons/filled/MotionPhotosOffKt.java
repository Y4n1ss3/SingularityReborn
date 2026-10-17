package androidx.compose.material.icons.filled;

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
import defpackage.fc;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MotionPhotosOffKt {
    private static ImageVector _motionPhotosOff;

    public static final ImageVector getMotionPhotosOff(Icons.Filled filled) {
        ImageVector imageVector = _motionPhotosOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.MotionPhotosOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.84f, 20.84f, 3.16f, 3.16f);
        i.lineTo(1.89f, 4.43f);
        i.lineToRelative(1.89f, 1.89f);
        i.curveTo(2.66f, 7.93f, 2.0f, 9.89f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        i.curveToRelative(2.11f, 0.0f, 4.07f, -0.66f, 5.68f, -1.77f);
        fc.C(i, 1.89f, 1.89f, 1.27f, -1.28f);
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        i.curveToRelative(0.0f, -1.55f, 0.45f, -3.0f, 1.22f, -4.23f);
        i.lineToRelative(1.46f, 1.46f);
        i.curveTo(6.25f, 10.06f, 6.0f, 11.0f, 6.0f, 12.0f);
        i.curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f);
        i.curveToRelative(1.0f, 0.0f, 1.94f, -0.25f, 2.77f, -0.68f);
        i.lineToRelative(1.46f, 1.46f);
        i.curveTo(15.0f, 19.55f, 13.55f, 20.0f, 12.0f, 20.0f);
        i.close();
        i.moveTo(6.32f, 3.77f);
        i.curveTo(7.93f, 2.66f, 9.89f, 2.0f, 12.0f, 2.0f);
        i.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        i.curveToRelative(0.0f, 2.11f, -0.66f, 4.07f, -1.77f, 5.68f);
        i.lineToRelative(-1.45f, -1.45f);
        i.curveTo(19.55f, 15.0f, 20.0f, 13.55f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f);
        i.curveToRelative(-1.55f, 0.0f, -3.0f, 0.45f, -4.23f, 1.22f);
        uo.l(i, 6.32f, 3.77f, 18.0f, 12.0f);
        i.curveToRelative(0.0f, 1.0f, -0.25f, 1.94f, -0.68f, 2.77f);
        i.lineTo(9.23f, 6.68f);
        i.curveTo(10.06f, 6.25f, 11.0f, 6.0f, 12.0f, 6.0f);
        i.curveToRelative(3.31f, 0.0f, 6.0f, 2.69f, 6.0f, 6.0f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _motionPhotosOff = build;
        build.getClass();
        return build;
    }
}
