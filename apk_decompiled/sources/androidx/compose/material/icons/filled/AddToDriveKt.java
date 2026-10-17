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
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddToDriveKt {
    private static ImageVector _addToDrive;

    public static final ImageVector getAddToDrive(Icons.Filled filled) {
        ImageVector imageVector = _addToDrive;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AddToDrive", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = kp0.s(20.0f, 21.0f, -3.0f, 3.0f, -2.0f);
        af0.v(s, -3.0f, -3.0f, -2.0f, 3.0f);
        af0.v(s, -3.0f, 2.0f, 3.0f, 3.0f);
        kp0.B(s, 20.0f, 15.03f, 21.5f, 5.66f);
        s.curveToRelative(-0.72f, 0.0f, -1.38f, -0.38f, -1.73f, -1.0f);
        s.lineTo(1.57f, 16.4f);
        s.curveToRelative(-0.36f, -0.62f, -0.35f, -1.38f, 0.01f, -2.0f);
        s.lineTo(7.92f, 3.49f);
        s.curveTo(8.28f, 2.88f, 8.94f, 2.5f, 9.65f, 2.5f);
        s.horizontalLineToRelative(4.7f);
        s.curveToRelative(0.71f, 0.0f, 1.37f, 0.38f, 1.73f, 0.99f);
        s.lineToRelative(4.48f, 7.71f);
        s.curveTo(20.06f, 11.07f, 19.54f, 11.0f, 19.0f, 11.0f);
        s.curveToRelative(-0.28f, 0.0f, -0.56f, 0.02f, -0.84f, 0.06f);
        s.lineTo(14.35f, 4.5f);
        s.horizontalLineToRelative(-4.7f);
        s.lineTo(3.31f, 15.41f);
        s.lineToRelative(2.35f, 4.09f);
        s.horizontalLineToRelative(7.89f);
        s.curveTo(13.9f, 20.27f, 14.4f, 20.95f, 15.03f, 21.5f);
        s.close();
        s.moveTo(13.34f, 15.0f);
        s.curveTo(13.12f, 15.63f, 13.0f, 16.3f, 13.0f, 17.0f);
        s.horizontalLineTo(7.25f);
        s.lineToRelative(-0.73f, -1.27f);
        s.lineToRelative(4.58f, -7.98f);
        s.horizontalLineToRelative(1.8f);
        s.lineToRelative(2.53f, 4.42f);
        s.curveToRelative(-0.56f, 0.42f, -1.05f, 0.93f, -1.44f, 1.51f);
        s.lineToRelative(-2.0f, -3.49f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.v(s, 9.25f, 15.0f, 13.34f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addToDrive = build;
        build.getClass();
        return build;
    }
}
