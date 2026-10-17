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
import defpackage.bv;
import defpackage.gy;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneBluetoothSpeakerKt {
    private static ImageVector _phoneBluetoothSpeaker;

    public static final ImageVector getPhoneBluetoothSpeaker(Icons.Outlined outlined) {
        ImageVector imageVector = _phoneBluetoothSpeaker;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.PhoneBluetoothSpeaker", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.0f, 15.5f);
        b.curveToRelative(-1.25f, 0.0f, -2.45f, -0.2f, -3.57f, -0.57f);
        b.curveToRelative(-0.1f, -0.03f, -0.21f, -0.05f, -0.31f, -0.05f);
        b.curveToRelative(-0.26f, 0.0f, -0.51f, 0.1f, -0.71f, 0.29f);
        b.lineToRelative(-2.2f, 2.2f);
        b.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        b.lineToRelative(2.2f, -2.21f);
        b.curveToRelative(0.28f, -0.26f, 0.36f, -0.65f, 0.25f, -1.0f);
        b.curveTo(8.7f, 6.45f, 8.5f, 5.25f, 8.5f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(4.0f, 3.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.curveToRelative(0.0f, 9.39f, 7.61f, 17.0f, 17.0f, 17.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.verticalLineToRelative(-3.5f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        af0.l(b, 5.03f, 5.0f, 1.5f);
        b.curveToRelative(0.07f, 0.88f, 0.22f, 1.75f, 0.45f, 2.58f);
        b.lineToRelative(-1.2f, 1.21f);
        b.curveToRelative(-0.4f, -1.21f, -0.66f, -2.47f, -0.75f, -3.79f);
        b.close();
        b.moveTo(19.0f, 18.97f);
        b.curveToRelative(-1.32f, -0.09f, -2.6f, -0.35f, -3.8f, -0.76f);
        b.lineToRelative(1.2f, -1.2f);
        b.curveToRelative(0.85f, 0.24f, 1.72f, 0.39f, 2.6f, 0.45f);
        r6.l(b, 1.51f, 14.71f, 9.5f);
        b.lineTo(17.0f, 7.21f);
        b.lineTo(17.0f, 11.0f);
        b.horizontalLineToRelative(0.5f);
        b.lineToRelative(2.85f, -2.85f);
        b.lineTo(18.21f, 6.0f);
        b.lineToRelative(2.15f, -2.15f);
        b.lineTo(17.5f, 1.0f);
        b.lineTo(17.0f, 1.0f);
        b.verticalLineToRelative(3.79f);
        b.lineTo(14.71f, 2.5f);
        b.lineToRelative(-0.71f, 0.71f);
        b.lineTo(16.79f, 6.0f);
        bv.o(b, 14.0f, 8.79f, 0.71f, 0.71f);
        b.moveTo(18.0f, 2.91f);
        b.lineToRelative(0.94f, 0.94f);
        gy.B(b, -0.94f, 0.94f, 18.0f, 2.91f);
        b.moveTo(18.0f, 7.21f);
        b.lineToRelative(0.94f, 0.94f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, -0.94f, 0.94f, 18.0f, 7.21f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneBluetoothSpeaker = build;
        build.getClass();
        return build;
    }
}
