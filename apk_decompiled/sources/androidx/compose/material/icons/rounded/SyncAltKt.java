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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SyncAltKt {
    private static ImageVector _syncAlt;

    public static final ImageVector getSyncAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _syncAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SyncAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.65f, 7.65f, -2.79f, -2.79f);
        e.curveTo(18.54f, 4.54f, 18.0f, 4.76f, 18.0f, 5.21f);
        e.verticalLineTo(7.0f);
        e.horizontalLineTo(4.0f);
        e.curveTo(3.45f, 7.0f, 3.0f, 7.45f, 3.0f, 8.0f);
        e.reflectiveCurveToRelative(0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(14.0f);
        e.verticalLineToRelative(1.79f);
        e.curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f);
        e.lineToRelative(2.79f, -2.79f);
        e.curveTo(21.84f, 8.16f, 21.84f, 7.84f, 21.65f, 7.65f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder q = j50.q(20.0f, 15.0f, 6.0f, -1.79f);
        q.curveToRelative(0.0f, -0.45f, -0.54f, -0.67f, -0.85f, -0.35f);
        q.lineToRelative(-2.79f, 2.79f);
        q.curveToRelative(-0.2f, 0.19f, -0.2f, 0.51f, -0.01f, 0.7f);
        q.lineToRelative(2.79f, 2.79f);
        q.curveTo(5.46f, 19.46f, 6.0f, 19.24f, 6.0f, 18.79f);
        q.verticalLineTo(17.0f);
        q.horizontalLineToRelative(14.0f);
        q.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(q, 20.55f, 15.0f, 20.0f, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncAlt = build;
        build.getClass();
        return build;
    }
}
