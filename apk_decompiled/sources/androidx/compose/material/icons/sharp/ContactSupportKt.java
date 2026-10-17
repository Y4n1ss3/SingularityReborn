package androidx.compose.material.icons.sharp;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContactSupportKt {
    private static ImageVector _contactSupport;

    public static final ImageVector getContactSupport(Icons.Sharp sharp) {
        ImageVector imageVector = _contactSupport;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.ContactSupport", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.5f, 2.0f);
        b.curveTo(6.81f, 2.0f, 3.0f, 5.81f, 3.0f, 10.5f);
        b.reflectiveCurveTo(6.81f, 19.0f, 11.5f, 19.0f);
        b.horizontalLineToRelative(0.5f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(4.86f, -2.34f, 8.0f, -7.0f, 8.0f, -11.5f);
        b.curveTo(20.0f, 5.81f, 16.19f, 2.0f, 11.5f, 2.0f);
        r6.B(b, 12.5f, 16.5f, -2.0f, -2.0f);
        fc.x(b, 2.0f, 2.0f, 12.5f, 13.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -3.25f, 3.0f, -3.0f, 3.0f, -5.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.horizontalLineToRelative(-2.0f);
        b.curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f);
        b.reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f);
        b.curveToRelative(0.0f, 2.5f, -3.0f, 2.75f, -3.0f, 5.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _contactSupport = build;
        build.getClass();
        return build;
    }

    @er
    public static /* synthetic */ void getContactSupport$annotations(Icons.Sharp sharp) {
    }
}
