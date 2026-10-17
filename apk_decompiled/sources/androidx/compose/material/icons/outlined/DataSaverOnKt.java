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
import defpackage.fc;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DataSaverOnKt {
    private static ImageVector _dataSaverOn;

    public static final ImageVector getDataSaverOn(Icons.Outlined outlined) {
        ImageVector imageVector = _dataSaverOn;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DataSaverOn", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = fc.d(11.0f, 8.0f, 3.0f, 8.0f, 2.0f);
        af0.v(d, 3.0f, 3.0f, 2.0f, -3.0f);
        af0.w(d, 3.0f, -2.0f, -3.0f, 8.0f);
        kp0.D(d, 11.0f, 13.0f, 2.05f, 3.03f);
        d.curveToRelative(3.39f, 0.49f, 6.0f, 3.39f, 6.0f, 6.92f);
        d.curveToRelative(0.0f, 0.9f, -0.18f, 1.75f, -0.48f, 2.54f);
        d.lineToRelative(2.6f, 1.53f);
        d.curveTo(21.68f, 14.83f, 22.0f, 13.45f, 22.0f, 12.0f);
        d.curveTo(22.0f, 6.82f, 18.05f, 2.55f, 13.0f, 2.05f);
        d.close();
        d.moveTo(12.0f, 19.0f);
        d.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        d.curveToRelative(0.0f, -3.53f, 2.61f, -6.43f, 6.0f, -6.92f);
        d.verticalLineTo(2.05f);
        d.curveTo(5.94f, 2.55f, 2.0f, 6.81f, 2.0f, 12.0f);
        d.curveToRelative(0.0f, 5.52f, 4.47f, 10.0f, 9.99f, 10.0f);
        d.curveToRelative(3.31f, 0.0f, 6.24f, -1.61f, 8.06f, -4.09f);
        d.lineToRelative(-2.6f, -1.53f);
        d.curveTo(16.17f, 17.98f, 14.21f, 19.0f, 12.0f, 19.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dataSaverOn = build;
        build.getClass();
        return build;
    }
}
