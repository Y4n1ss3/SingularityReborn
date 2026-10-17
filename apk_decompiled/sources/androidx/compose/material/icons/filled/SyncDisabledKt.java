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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SyncDisabledKt {
    private static ImageVector _syncDisabled;

    public static final ImageVector getSyncDisabled(Icons.Filled filled) {
        ImageVector imageVector = _syncDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SyncDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(10.0f, 6.35f, 10.0f, 4.26f);
        i.curveToRelative(-0.8f, 0.21f, -1.55f, 0.54f, -2.23f, 0.96f);
        i.lineToRelative(1.46f, 1.46f);
        i.curveToRelative(0.25f, -0.12f, 0.5f, -0.24f, 0.77f, -0.33f);
        k4.x(i, 2.86f, 5.41f, 2.36f, 2.36f);
        i.curveTo(4.45f, 8.99f, 4.0f, 10.44f, 4.0f, 12.0f);
        i.curveToRelative(0.0f, 2.21f, 0.91f, 4.2f, 2.36f, 5.64f);
        fc.w(i, 4.0f, 20.0f, 6.0f, -6.0f);
        i.lineToRelative(-2.24f, 2.24f);
        i.curveTo(6.68f, 15.15f, 6.0f, 13.66f, 6.0f, 12.0f);
        i.curveToRelative(0.0f, -1.0f, 0.25f, -1.94f, 0.68f, -2.77f);
        i.lineToRelative(8.08f, 8.08f);
        i.curveToRelative(-0.25f, 0.13f, -0.5f, 0.25f, -0.77f, 0.34f);
        i.verticalLineToRelative(2.09f);
        i.curveToRelative(0.8f, -0.21f, 1.55f, -0.54f, 2.23f, -0.96f);
        i.lineToRelative(2.36f, 2.36f);
        i.lineToRelative(1.27f, -1.27f);
        r6.C(i, 4.14f, 4.14f, 2.86f, 5.41f);
        k4.C(i, 20.0f, 4.0f, -6.0f, 6.0f);
        i.lineToRelative(2.24f, -2.24f);
        i.curveTo(17.32f, 8.85f, 18.0f, 10.34f, 18.0f, 12.0f);
        i.curveToRelative(0.0f, 1.0f, -0.25f, 1.94f, -0.68f, 2.77f);
        i.lineToRelative(1.46f, 1.46f);
        i.curveTo(19.55f, 15.01f, 20.0f, 13.56f, 20.0f, 12.0f);
        i.curveToRelative(0.0f, -2.21f, -0.91f, -4.2f, -2.36f, -5.64f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 20.0f, 4.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _syncDisabled = build;
        build.getClass();
        return build;
    }
}
