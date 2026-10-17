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
import defpackage.er;
import defpackage.fc;
import defpackage.j50;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MissedVideoCallKt {
    private static ImageVector _missedVideoCall;

    public static final ImageVector getMissedVideoCall(Icons.Outlined outlined) {
        ImageVector imageVector = _missedVideoCall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.MissedVideoCall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(17.0f, 10.5f, 17.0f, 7.0f);
        i.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        i.lineTo(4.0f, 6.0f);
        i.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        i.verticalLineToRelative(10.0f);
        i.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        i.horizontalLineToRelative(12.0f);
        i.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        j50.A(i, -3.5f, 4.0f, 4.0f, -11.0f);
        fc.B(i, -4.0f, 4.0f, 15.0f, 8.67f);
        i.lineTo(15.0f, 16.0f);
        i.lineTo(5.0f, 16.0f);
        r6.m(i, 5.0f, 8.0f, 10.0f, 0.67f);
        i.moveTo(7.11f, 11.11f);
        i.lineTo(11.0f, 15.0f);
        i.lineToRelative(3.77f, -3.79f);
        i.lineToRelative(-0.78f, -0.79f);
        i.lineTo(11.0f, 13.43f);
        i.lineToRelative(-3.11f, -3.1f);
        i.horizontalLineToRelative(2.55f);
        i.lineTo(10.44f, 9.22f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, j50.w(i, 6.0f, 9.22f, 4.44f, 1.11f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _missedVideoCall = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getMissedVideoCall$annotations(Icons.Outlined outlined) {
    }
}
