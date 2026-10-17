package androidx.compose.ui.graphics.shadow;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.unit.LayoutDirection;
import defpackage.o;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public abstract class ShadowRenderer {
    public static final int $stable = 8;
    private final Outline outline;
    private Path path;
    private ColorFilter shadowTint;
    private long shadowTintColor = Color.Companion.m4797getUnspecified0d7_KjU();
    private long cornerRadius = CornerRadius.Companion.m4488getZerokKHJgLs();
    private long generatedSize = Size.Companion.m4593getUnspecifiedNHjbRc();
    private LayoutDirection generatedLayoutDirection = LayoutDirection.Ltr;
    private float generatedDensity = 1.0f;

    public ShadowRenderer(Outline outline) {
        this.outline = outline;
    }

    /* renamed from: obtainTint-8_81llA, reason: not valid java name */
    private final ColorFilter m5483obtainTint8_81llA(long j) {
        ColorFilter colorFilter = this.shadowTint;
        if (colorFilter != null && Color.m4762equalsimpl0(this.shadowTintColor, j)) {
            return colorFilter;
        }
        ColorFilter m4802tintxETnrds$default = ColorFilter.Companion.m4802tintxETnrds$default(ColorFilter.Companion, j, 0, 2, null);
        this.shadowTintColor = j;
        this.shadowTint = m4802tintxETnrds$default;
        return m4802tintxETnrds$default;
    }

    private final void updateParamsFromOutline(Outline outline) {
        if (outline instanceof Outline.Generic) {
            this.path = ((Outline.Generic) outline).getPath();
            this.cornerRadius = CornerRadius.Companion.m4488getZerokKHJgLs();
            return;
        }
        if (!(outline instanceof Outline.Rounded)) {
            if (!(outline instanceof Outline.Rectangle)) {
                o.n();
                return;
            } else {
                this.path = null;
                this.cornerRadius = CornerRadius.Companion.m4488getZerokKHJgLs();
                return;
            }
        }
        Outline.Rounded rounded = (Outline.Rounded) outline;
        if (RoundRectKt.isSimple(rounded.getRoundRect())) {
            this.path = null;
            this.cornerRadius = rounded.getRoundRect().m4566getTopLeftCornerRadiuskKHJgLs();
        } else {
            this.path = rounded.getRoundRectPath$ui_graphics();
            this.cornerRadius = CornerRadius.Companion.m4488getZerokKHJgLs();
        }
    }

    /* renamed from: buildShadow-_SMYjrA */
    public abstract void mo5473buildShadow_SMYjrA(DrawScope drawScope, long j, long j2, Path path);

    /* renamed from: drawShadow-erFMhIw, reason: not valid java name */
    public final void m5484drawShadowerFMhIw(DrawScope drawScope, ColorFilter colorFilter, long j, long j2, Brush brush, float f, int i) {
        updateParamsFromOutline(this.outline);
        if (colorFilter == null) {
            colorFilter = (brush != null || j2 == 16) ? null : m5483obtainTint8_81llA(j2);
        }
        ColorFilter colorFilter2 = colorFilter;
        long j3 = this.generatedSize;
        if (j3 == InlineClassHelperKt.UnspecifiedPackedFloats || !Size.m4581equalsimpl0(j3, j) || this.generatedLayoutDirection != drawScope.getLayoutDirection() || this.generatedDensity != drawScope.getDensity()) {
            mo5473buildShadow_SMYjrA(drawScope, j, this.cornerRadius, this.path);
            this.generatedSize = j;
            this.generatedLayoutDirection = drawScope.getLayoutDirection();
            this.generatedDensity = drawScope.getDensity();
        }
        mo5474onDrawShadowMLmccfk(drawScope, j, this.cornerRadius, this.path, f, colorFilter2, brush, i);
    }

    public final Outline getOutline() {
        return this.outline;
    }

    public void invalidateShadow() {
        this.generatedSize = Size.Companion.m4593getUnspecifiedNHjbRc();
        this.generatedLayoutDirection = LayoutDirection.Ltr;
        this.generatedDensity = 1.0f;
    }

    /* renamed from: onDrawShadow-MLmccfk */
    public abstract void mo5474onDrawShadowMLmccfk(DrawScope drawScope, long j, long j2, Path path, float f, ColorFilter colorFilter, Brush brush, int i);
}
