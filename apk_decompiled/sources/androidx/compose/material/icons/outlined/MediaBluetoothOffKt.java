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
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediaBluetoothOffKt {
    private static ImageVector _mediaBluetoothOff;

    public static final ImageVector getMediaBluetoothOff(Icons.Outlined outlined) {
        ImageVector imageVector = _mediaBluetoothOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MediaBluetoothOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder c = af0.c(9.0f, 6.17f, 3.0f, 6.0f, 4.0f);
        j50.o(c, -4.0f, 1.17f, 9.0f, 6.17f);
        c.moveTo(19.42f, 15.0f);
        c.lineTo(22.0f, 17.57f);
        c.lineToRelative(-0.8f, 0.8f);
        c.lineToRelative(-6.78f, -6.78f);
        c.lineToRelative(0.8f, -0.8f);
        fc.u(c, 2.75f, 2.75f, 9.0f, 0.6f);
        r6.C(c, 22.0f, 12.43f, 19.42f, 15.0f);
        c.moveTo(19.17f, 13.55f);
        c.lineToRelative(1.13f, -1.13f);
        uf.x(c, -1.13f, -1.13f, 13.55f);
        c.moveTo(21.19f, 21.19f);
        c.lineToRelative(-1.41f, 1.41f);
        c.lineToRelative(-3.98f, -3.98f);
        c.lineToRelative(-0.58f, 0.58f);
        c.lineToRelative(-0.85f, -0.85f);
        c.lineToRelative(0.58f, -0.58f);
        c.lineTo(11.0f, 13.83f);
        c.verticalLineTo(17.0f);
        c.curveToRelative(0.0f, 2.21f, -1.78f, 4.0f, -3.99f, 4.0f);
        c.reflectiveCurveTo(3.0f, 19.21f, 3.0f, 17.0f);
        c.reflectiveCurveToRelative(1.79f, -4.0f, 4.01f, -4.0f);
        c.curveToRelative(0.73f, 0.0f, 1.41f, 0.21f, 2.0f, 0.55f);
        c.verticalLineToRelative(-1.72f);
        c.lineTo(1.39f, 4.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(c, 2.8f, 2.81f, 21.19f, 21.19f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediaBluetoothOff = build;
        build.getClass();
        return build;
    }
}
