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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddTaskKt {
    private static ImageVector _addTask;

    public static final ImageVector getAddTask(Icons.Outlined outlined) {
        ImageVector imageVector = _addTask;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AddTask", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(22.0f, 5.18f, 10.59f, 16.6f);
        i.lineToRelative(-4.24f, -4.24f);
        i.lineToRelative(1.41f, -1.41f);
        i.lineToRelative(2.83f, 2.83f);
        gy.B(i, 10.0f, -10.0f, 22.0f, 5.18f);
        i.moveTo(12.0f, 20.0f);
        i.curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f);
        i.reflectiveCurveToRelative(3.59f, -8.0f, 8.0f, -8.0f);
        i.curveToRelative(1.57f, 0.0f, 3.04f, 0.46f, 4.28f, 1.25f);
        i.lineToRelative(1.45f, -1.45f);
        i.curveTo(16.1f, 2.67f, 14.13f, 2.0f, 12.0f, 2.0f);
        i.curveTo(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
        i.reflectiveCurveToRelative(4.48f, 10.0f, 10.0f, 10.0f);
        i.curveToRelative(1.73f, 0.0f, 3.36f, -0.44f, 4.78f, -1.22f);
        i.lineToRelative(-1.5f, -1.5f);
        i.curveTo(14.28f, 19.74f, 13.17f, 20.0f, 12.0f, 20.0f);
        r6.B(i, 19.0f, 15.0f, -3.0f, 2.0f);
        af0.v(i, 3.0f, 3.0f, 2.0f, -3.0f);
        af0.v(i, 3.0f, -2.0f, -3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(i, -2.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addTask = build;
        build.getClass();
        return build;
    }
}
