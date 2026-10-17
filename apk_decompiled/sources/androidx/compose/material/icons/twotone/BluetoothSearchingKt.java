package androidx.compose.material.icons.twotone;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.er;
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BluetoothSearchingKt {
    private static ImageVector _bluetoothSearching;

    public static final ImageVector getBluetoothSearching(Icons.TwoTone twoTone) {
        ImageVector imageVector = _bluetoothSearching;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BluetoothSearching", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.24f, 12.01f, 2.32f, 2.32f);
        e.curveToRelative(0.28f, -0.72f, 0.44f, -1.51f, 0.44f, -2.33f);
        e.reflectiveCurveToRelative(-0.16f, -1.59f, -0.43f, -2.31f);
        fc.B(e, -2.33f, 2.32f, 19.53f, 6.71f);
        e.lineToRelative(-1.26f, 1.26f);
        e.curveToRelative(0.63f, 1.21f, 0.98f, 2.57f, 0.98f, 4.02f);
        e.reflectiveCurveToRelative(-0.36f, 2.82f, -0.98f, 4.02f);
        e.lineToRelative(1.2f, 1.2f);
        e.curveToRelative(0.97f, -1.54f, 1.54f, -3.36f, 1.54f, -5.31f);
        e.curveToRelative(-0.01f, -1.89f, -0.55f, -3.67f, -1.48f, -5.19f);
        k4.r(e, 15.71f, 7.71f, 10.0f, 2.0f);
        e.lineTo(9.0f, 2.0f);
        e.verticalLineToRelative(7.59f);
        e.lineTo(4.41f, 5.0f);
        e.lineTo(3.0f, 6.41f);
        e.lineTo(8.59f, 12.0f);
        e.lineTo(3.0f, 17.59f);
        e.lineTo(4.41f, 19.0f);
        e.lineTo(9.0f, 14.41f);
        e.lineTo(9.0f, 22.0f);
        e.horizontalLineToRelative(1.0f);
        e.lineToRelative(5.71f, -5.71f);
        fc.C(e, -4.3f, -4.29f, 4.3f, -4.29f);
        e.moveTo(11.0f, 5.83f);
        e.lineToRelative(1.88f, 1.88f);
        r6.C(e, 11.0f, 9.59f, 11.0f, 5.83f);
        e.moveTo(12.88f, 16.29f);
        e.lineTo(11.0f, 18.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.o(e, -3.76f, 1.88f, 1.88f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _bluetoothSearching = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getBluetoothSearching$annotations(Icons.TwoTone twoTone) {
    }
}
