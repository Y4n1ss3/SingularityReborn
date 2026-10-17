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
import defpackage.af0;
import defpackage.bv;
import defpackage.er;
import defpackage.fc;
import defpackage.gy;
import defpackage.j50;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MissedVideoCallKt {
    private static ImageVector _missedVideoCall;

    public static final ImageVector getMissedVideoCall(Icons.TwoTone twoTone) {
        ImageVector imageVector = _missedVideoCall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.MissedVideoCall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder f = j50.f(15.0f, 13.5f, 8.0f, 5.0f, 8.0f);
        fc.x(f, 10.0f, -2.5f, 11.0f, 15.0f);
        gy.j(f, -3.89f, -3.89f, 2.55f, 6.0f);
        j50.B(f, 9.22f, 4.44f, 1.11f, 7.89f);
        f.lineToRelative(3.11f, 3.1f);
        f.lineToRelative(2.99f, -3.01f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(f, 0.78f, 0.79f, 11.0f, 15.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(3.0f, 17.0f);
        b.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        b.horizontalLineToRelative(12.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        j50.A(b, -3.5f, 4.0f, 4.0f, -11.0f);
        b.lineToRelative(-4.0f, 4.0f);
        b.lineTo(17.0f, 7.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(4.0f, 6.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        bv.m(b, 10.0f, 5.0f, 8.0f, 10.0f);
        b.verticalLineToRelative(8.0f);
        r6.C(b, 5.0f, 16.0f, 5.0f, 8.0f);
        b.moveTo(11.0f, 13.43f);
        b.lineToRelative(-3.11f, -3.1f);
        b.horizontalLineToRelative(2.55f);
        b.lineTo(10.44f, 9.22f);
        af0.m(b, 6.0f, 9.22f, 4.44f, 1.11f);
        b.verticalLineToRelative(-2.55f);
        b.lineTo(11.0f, 15.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 3.77f, -3.79f, -0.78f, -0.79f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _missedVideoCall = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getMissedVideoCall$annotations(Icons.TwoTone twoTone) {
    }
}
