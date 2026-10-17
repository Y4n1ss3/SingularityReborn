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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalPoliceKt {
    private static ImageVector _localPolice;

    public static final ImageVector getLocalPolice(Icons.Outlined outlined) {
        ImageVector imageVector = _localPolice;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocalPolice", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(14.5f, 12.59f, 0.9f, 3.88f);
        e.lineTo(12.0f, 14.42f);
        e.lineToRelative(-3.4f, 2.05f);
        e.lineToRelative(0.9f, -3.87f);
        e.lineToRelative(-3.0f, -2.59f);
        e.lineToRelative(3.96f, -0.34f);
        e.lineTo(12.0f, 6.02f);
        e.lineToRelative(1.54f, 3.64f);
        r6.C(e, 17.5f, 10.0f, 14.5f, 12.59f);
        e.moveTo(12.0f, 3.19f);
        e.lineToRelative(7.0f, 3.11f);
        e.verticalLineTo(11.0f);
        e.curveToRelative(0.0f, 4.52f, -2.98f, 8.69f, -7.0f, 9.93f);
        e.curveTo(7.98f, 19.69f, 5.0f, 15.52f, 5.0f, 11.0f);
        e.verticalLineTo(6.3f);
        e.lineTo(12.0f, 3.19f);
        e.moveTo(12.0f, 1.0f);
        e.lineTo(3.0f, 5.0f);
        e.verticalLineToRelative(6.0f);
        e.curveToRelative(0.0f, 5.55f, 3.84f, 10.74f, 9.0f, 12.0f);
        e.curveToRelative(5.16f, -1.26f, 9.0f, -6.45f, 9.0f, -12.0f);
        e.verticalLineTo(5.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 12.0f, 1.0f, 12.0f, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localPolice = build;
        build.getClass();
        return build;
    }
}
