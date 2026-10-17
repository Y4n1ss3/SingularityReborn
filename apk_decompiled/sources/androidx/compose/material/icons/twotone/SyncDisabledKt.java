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
import defpackage.fc;
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SyncDisabledKt {
    private static ImageVector _syncDisabled;

    public static final ImageVector getSyncDisabled(Icons.TwoTone twoTone) {
        ImageVector imageVector = _syncDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SyncDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(10.0f, 6.35f, 4.26f);
        d.curveToRelative(-0.66f, 0.17f, -1.29f, 0.43f, -1.88f, 0.75f);
        d.lineToRelative(1.5f, 1.5f);
        d.curveToRelative(0.13f, -0.05f, 0.25f, -0.11f, 0.38f, -0.16f);
        d.close();
        d.moveTo(20.0f, 12.0f);
        d.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        fc.w(d, 20.0f, 4.0f, -6.0f, 6.0f);
        d.lineToRelative(2.24f, -2.24f);
        d.curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f);
        d.curveToRelative(0.0f, 0.85f, -0.19f, 1.65f, -0.51f, 2.38f);
        d.lineToRelative(1.5f, 1.5f);
        d.curveTo(19.63f, 14.74f, 20.0f, 13.41f, 20.0f, 12.0f);
        k4.r(d, 4.27f, 4.0f, 2.86f, 5.41f);
        d.lineToRelative(2.36f, 2.36f);
        d.curveTo(4.45f, 8.99f, 4.0f, 10.44f, 4.0f, 12.0f);
        d.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        fc.w(d, 4.0f, 20.0f, 6.0f, -6.0f);
        d.lineToRelative(-2.24f, 2.24f);
        d.curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f);
        d.curveToRelative(0.0f, -1.0f, 0.25f, -1.94f, 0.68f, -2.77f);
        d.lineToRelative(8.08f, 8.08f);
        d.curveToRelative(-0.25f, 0.13f, -0.5f, 0.24f, -0.76f, 0.34f);
        d.verticalLineToRelative(2.09f);
        d.curveToRelative(0.8f, -0.21f, 1.55f, -0.54f, 2.23f, -0.96f);
        d.lineToRelative(2.58f, 2.58f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 1.41f, -1.41f, 4.27f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncDisabled = build;
        build.getClass();
        return build;
    }
}
