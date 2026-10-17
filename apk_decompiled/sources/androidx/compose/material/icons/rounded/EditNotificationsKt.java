package androidx.compose.material.icons.rounded;

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
import defpackage.kf0;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class EditNotificationsKt {
    private static ImageVector _editNotifications;

    public static final ImageVector getEditNotifications(Icons.Rounded rounded) {
        ImageVector imageVector = _editNotifications;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.EditNotifications", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.58f, 6.25f, 1.77f, 1.77f);
        e.lineToRelative(-4.84f, 4.84f);
        e.curveTo(14.42f, 12.95f, 14.29f, 13.0f, 14.16f, 13.0f);
        e.horizontalLineTo(13.1f);
        e.curveToRelative(-0.28f, 0.0f, -0.5f, -0.22f, -0.5f, -0.5f);
        e.verticalLineToRelative(-1.06f);
        e.curveToRelative(0.0f, -0.13f, 0.05f, -0.26f, 0.15f, -0.35f);
        uo.l(e, 17.58f, 6.25f, 20.85f, 5.81f);
        e.lineToRelative(-1.06f, -1.06f);
        e.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        e.lineToRelative(-0.85f, 0.85f);
        e.lineToRelative(1.77f, 1.77f);
        e.lineToRelative(0.85f, -0.85f);
        e.curveTo(21.05f, 6.32f, 21.05f, 6.0f, 20.85f, 5.81f);
        e.close();
        e.moveTo(20.0f, 18.0f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.horizontalLineTo(5.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(1.0f);
        e.verticalLineToRelative(-7.0f);
        e.curveToRelative(0.0f, -2.79f, 1.91f, -5.14f, 4.5f, -5.8f);
        e.verticalLineTo(3.5f);
        e.curveTo(10.5f, 2.67f, 11.17f, 2.0f, 12.0f, 2.0f);
        e.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        e.verticalLineToRelative(0.7f);
        e.curveToRelative(0.82f, 0.21f, 1.57f, 0.59f, 2.21f, 1.09f);
        e.lineToRelative(-4.52f, 4.52f);
        e.curveToRelative(-0.38f, 0.38f, -0.59f, 0.88f, -0.59f, 1.41f);
        e.verticalLineTo(13.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(1.77f);
        e.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        fc.t(e, 18.0f, 12.2f, 17.0f, 1.0f);
        e.curveTo(19.55f, 17.0f, 20.0f, 17.45f, 20.0f, 18.0f);
        af0.l(e, 10.0f, 20.0f, 4.0f);
        e.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(e, 10.0f, 21.1f, 10.0f, 20.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _editNotifications = build;
        build.getClass();
        return build;
    }
}
