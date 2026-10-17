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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LeakRemoveKt {
    private static ImageVector _leakRemove;

    public static final ImageVector getLeakRemove(Icons.Filled filled) {
        ImageVector imageVector = _leakRemove;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LeakRemove", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.0f, 3.0f, 8.0f, 3.0f);
        i.curveToRelative(0.0f, 0.37f, -0.04f, 0.72f, -0.12f, 1.06f);
        i.lineToRelative(1.59f, 1.59f);
        i.curveTo(9.81f, 4.84f, 10.0f, 3.94f, 10.0f, 3.0f);
        k4.x(i, 3.0f, 4.27f, 2.84f, 2.84f);
        i.curveTo(5.03f, 7.67f, 4.06f, 8.0f, 3.0f, 8.0f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(1.61f, 0.0f, 3.09f, -0.55f, 4.27f, -1.46f);
        i.lineTo(8.7f, 9.97f);
        i.curveTo(7.14f, 11.24f, 5.16f, 12.0f, 3.0f, 12.0f);
        i.verticalLineToRelative(2.0f);
        i.curveToRelative(2.71f, 0.0f, 5.19f, -0.99f, 7.11f, -2.62f);
        i.lineToRelative(2.5f, 2.5f);
        i.curveTo(10.99f, 15.81f, 10.0f, 18.29f, 10.0f, 21.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, -2.16f, 0.76f, -4.14f, 2.03f, -5.69f);
        i.lineToRelative(1.43f, 1.43f);
        i.curveTo(14.55f, 17.91f, 14.0f, 19.39f, 14.0f, 21.0f);
        i.horizontalLineToRelative(2.0f);
        i.curveToRelative(0.0f, -1.06f, 0.33f, -2.03f, 0.89f, -2.84f);
        i.lineTo(19.73f, 21.0f);
        i.lineTo(21.0f, 19.73f);
        r6.C(i, 4.27f, 3.0f, 3.0f, 4.27f);
        i.moveTo(14.0f, 3.0f);
        i.horizontalLineToRelative(-2.0f);
        i.curveToRelative(0.0f, 1.5f, -0.37f, 2.91f, -1.02f, 4.16f);
        i.lineToRelative(1.46f, 1.46f);
        i.curveTo(13.42f, 6.98f, 14.0f, 5.06f, 14.0f, 3.0f);
        i.close();
        i.moveTo(19.94f, 16.12f);
        i.curveToRelative(0.34f, -0.08f, 0.69f, -0.12f, 1.06f, -0.12f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(-0.94f, 0.0f, -1.84f, 0.19f, -2.66f, 0.52f);
        fc.B(i, 1.6f, 1.6f, 15.38f, 11.56f);
        i.lineToRelative(1.46f, 1.46f);
        i.curveTo(18.09f, 12.37f, 19.5f, 12.0f, 21.0f, 12.0f);
        i.verticalLineToRelative(-2.0f);
        i.curveToRelative(-2.06f, 0.0f, -3.98f, 0.58f, -5.62f, 1.56f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _leakRemove = build;
        build.getClass();
        return build;
    }
}
