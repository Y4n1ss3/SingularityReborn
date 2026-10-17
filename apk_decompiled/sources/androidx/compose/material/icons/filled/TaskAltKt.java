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
import defpackage.gy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TaskAltKt {
    private static ImageVector _taskAlt;

    public static final ImageVector getTaskAlt(Icons.Filled filled) {
        ImageVector imageVector = _taskAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.TaskAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 5.18f, 10.59f, 16.6f);
        i.lineToRelative(-4.24f, -4.24f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(2.83f, 2.83f);
        gy.B(i, 10.0f, -10.0f, 22.0f, 5.18f);
        i.moveTo(19.79f, 10.22f);
        i.curveTo(19.92f, 10.79f, 20.0f, 11.39f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, 4.42f, -3.58f, 8.0f, -8.0f, 8.0f);
        i.reflectiveCurveToRelative(-8.0f, -3.58f, -8.0f, -8.0f);
        i.curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f);
        i.curveToRelative(1.58f, 0.0f, 3.04f, 0.46f, 4.28f, 1.25f);
        i.lineToRelative(1.44f, -1.44f);
        i.curveTo(16.1f, 2.67f, 14.13f, 2.0f, 12.0f, 2.0f);
        i.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        i.curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f);
        i.reflectiveCurveToRelative(10.0f, -4.48f, 10.0f, -10.0f);
        i.curveToRelative(0.0f, -1.19f, -0.22f, -2.33f, -0.6f, -3.39f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 19.79f, 10.22f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _taskAlt = build;
        build.getClass();
        return build;
    }
}
